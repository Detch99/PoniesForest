package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;

import java.awt.Shape;

import lombok.Data;

@Data
public class FictureDefComponent implements Component {

    private Shape shape;
    private float density;
    private float restitution;
    private float friction;
}
