package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.box2d.BodyDef;

public class BodyDefComponent implements Component {

    private BodyDef.BodyType bodyType;
    private PositionComponent positionComponent;
    private boolean fixedRotation;

    public BodyDefComponent(BodyDef.BodyType bodyType, PositionComponent positionComponent, boolean fixedRotation) {
        this.bodyType = bodyType;
        this.positionComponent = positionComponent;
        this.fixedRotation = fixedRotation;
    }

    public BodyDef.BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyDef.BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public PositionComponent getPositionComponent() {
        return positionComponent;
    }

    public void setPositionComponent(PositionComponent positionComponent) {
        this.positionComponent = positionComponent;
    }

    public boolean isFixedRotation() {
        return fixedRotation;
    }

    public void setFixedRotation(boolean fixedRotation) {
        this.fixedRotation = fixedRotation;
    }
}
