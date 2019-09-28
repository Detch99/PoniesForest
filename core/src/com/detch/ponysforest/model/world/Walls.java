package com.detch.ponysforest.model.world;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.ChainShape;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.detch.ponysforest.model.BaseActor;

public class Walls extends BaseActor {

    public Walls(World world) {
        super(world);
        ChainShape shape = new ChainShape();
        shape.createChain(new Vector2[]{new Vector2(1,0.25f), new Vector2(19.75f, 0.25f),
                new Vector2(19.75f, 11), new Vector2(0.25f, 11), new Vector2(0.25f, 0.25f)});
        setPosition(0, 0);
        createBody(shape, BodyDef.BodyType.StaticBody);
    }

}
