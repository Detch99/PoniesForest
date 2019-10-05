package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.box2d.Body;

import lombok.Data;

@Data
public class BodyComponent implements Component {

    private Body body;

}
