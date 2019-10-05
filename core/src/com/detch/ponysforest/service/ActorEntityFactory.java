package com.detch.ponysforest.service;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.Shape;
import com.badlogic.gdx.physics.box2d.World;

public abstract class ActorEntityFactory extends EntityFactory {

    ActorEntityFactory(PooledEngine engine) {
        super(engine);
    }

    @Override
    public Entity createEntity() {
        throw new UnsupportedOperationException();
    }

    public abstract Entity createEntity(Vector2 position, World world);

    Body createBody(
            Vector2 position,
            World world,
            Shape shape,
            BodyDef.BodyType bodyType
    ) {
        BodyDef bodyDef = new BodyDef();
        FixtureDef fixtureDef = new FixtureDef();

        bodyDef.type = bodyType;
        bodyDef.position.set(position.x, position.y);
        bodyDef.fixedRotation = true;
        Body body = world.createBody(bodyDef);

        fixtureDef.shape = shape;
        fixtureDef.density = 15;
        fixtureDef.restitution = 0.4f;
        fixtureDef.friction = 0.5f;
        body.createFixture(fixtureDef);

        return body;
    }
}
