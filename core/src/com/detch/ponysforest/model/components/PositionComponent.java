package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;

import lombok.Data;

@Data
public class PositionComponent implements Component {

    private float x;
    private float y;

    public void setPosition(float x, float y) {
        setX(x);
        setY(y);
    }
}
