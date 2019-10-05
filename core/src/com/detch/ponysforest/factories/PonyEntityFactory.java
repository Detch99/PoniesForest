package com.detch.ponysforest.factories;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.detch.ponysforest.model.components.PonyComponent;
import com.detch.ponysforest.model.hero.Pony;
import com.detch.ponysforest.service.AssetsManager;

public class PonyEntityFactory extends ActorEntityFactory {

    public PonyEntityFactory(PooledEngine engine) {
        super(engine);
    }

    @Override
    public Entity createEntity(Vector2 position, World world) {
        Pony pony = new Pony();

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(1,1);
        Body body = createBody(position, world, shape, BodyDef.BodyType.DynamicBody);

        Sprite sprite = new Sprite();
        sprite.setRegion(AssetsManager.getPonyTexture());
        sprite.setPosition(position.x, position.y);

        pony.setSprite(sprite);
        pony.setPosition(position.x, position.y);
        pony.setBody(body);

        Entity ponyEntity = engine.createEntity();
        PonyComponent ponyComponent = engine.createComponent(PonyComponent.class);
        ponyComponent.setActor(pony);
        ponyEntity.add(ponyComponent);

        return ponyEntity;
    }
}
