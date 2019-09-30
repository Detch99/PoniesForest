package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.ChainShape;
import com.badlogic.gdx.physics.box2d.PolygonShape;

public class ShapeComponent implements Component {

    private PolygonShape polygonShape;
    private ChainShape chainShape;

    public PolygonShape getPolygonShape() {
        return polygonShape;
    }

    public void setPolygonShape(PolygonShape polygonShape) {
        this.polygonShape = polygonShape;
    }

    public ChainShape getChainShape() {
        return chainShape;
    }

    public void setChainShape(ChainShape chainShape) {
        this.chainShape = chainShape;
    }

    public void setAsBoxPolygonShape(float hx, float hy){
        polygonShape.setAsBox(hx, hy);
    }

    public void createChainShape(Vector2[] vertices){
        chainShape.createChain(vertices);
    }
}
