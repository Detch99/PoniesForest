package com.detch.ponysforest.factories;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.ChainShape;
import com.badlogic.gdx.physics.box2d.World;
import com.detch.ponysforest.model.components.WallsComponent;
import com.detch.ponysforest.model.world.Walls;

public class WallsEntityFactory extends ActorEntityFactory {

    public WallsEntityFactory(PooledEngine engine) {
        super(engine);
    }

    @Override
    public Entity createEntity(Vector2 position, World world) {
        Walls walls = new Walls();

        ChainShape shape = new ChainShape();
        shape.createChain(new Vector2[] {
                new Vector2(1,0.25f),
                new Vector2(19.75f, 0.25f),
                new Vector2(19.75f, 11),
                new Vector2(0.25f, 11),
                new Vector2(0.25f, 0.25f)
        });

        walls.setPosition(position.x, position.y);
        walls.setBody(createBody(position, world, shape, BodyDef.BodyType.StaticBody));

        Entity wallsEntity = engine.createEntity();
        WallsComponent wallsComponent = engine.createComponent(WallsComponent.class);
        wallsComponent.setActor(walls);
        wallsEntity.add(wallsComponent);

        return wallsEntity;
    }
}
