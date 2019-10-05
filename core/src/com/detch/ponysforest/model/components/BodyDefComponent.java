package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.box2d.BodyDef;

import lombok.Data;

@Data
public class BodyDefComponent implements Component {

    private BodyDef.BodyType bodyType;
    private PositionComponent positionComponent;
    private boolean fixedRotation;

}
