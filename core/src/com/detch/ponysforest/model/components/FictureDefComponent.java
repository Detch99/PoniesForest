package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;

import java.awt.Shape;

public class FictureDefComponent implements Component {

    private Shape shape;
    private float density;
    private float restitution;
    private float friction;

    public FictureDefComponent(Shape shape, float density, float restitution, float friction) {
        this.shape = shape;
        this.density = density;
        this.restitution = restitution;
        this.friction = friction;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getRestitution() {
        return restitution;
    }

    public void setRestitution(float restitution) {
        this.restitution = restitution;
    }

    public float getFriction() {
        return friction;
    }

    public void setFriction(float friction) {
        this.friction = friction;
    }
}
