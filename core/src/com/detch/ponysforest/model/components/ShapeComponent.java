package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.ChainShape;
import com.badlogic.gdx.physics.box2d.PolygonShape;

import lombok.Data;

@Data
public class ShapeComponent implements Component {

    private PolygonShape polygonShape;
    private ChainShape chainShape;

    public void setAsBoxPolygonShape(float hx, float hy){
        polygonShape.setAsBox(hx, hy);
    }

    public void createChainShape(Vector2[] vertices){
        chainShape.createChain(vertices);
    }
}
