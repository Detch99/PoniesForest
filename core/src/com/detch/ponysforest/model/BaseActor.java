package com.detch.ponysforest.model;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.Shape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BaseActor extends Actor {

    private Body body;
    private World world;

    public BaseActor(World world) {
        this.world = world;
    }

    protected void createBody(Shape shape, BodyDef.BodyType bodyType){

        BodyDef bodyDef = new BodyDef();
        FixtureDef fixtureDef = new FixtureDef();

        bodyDef.type = bodyType;
        bodyDef.position.set(getX(), getY());
        bodyDef.fixedRotation = true;
        body = world.createBody(bodyDef);

        fixtureDef.shape = shape;
        fixtureDef.density = 15;
        fixtureDef.restitution = 0.4f;
        fixtureDef.friction = 0.5f;
        body.createFixture(fixtureDef);
    }

    public Body getBody() {
        return body;
    }
}
