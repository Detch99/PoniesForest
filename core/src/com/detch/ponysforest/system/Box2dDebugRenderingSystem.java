package com.detch.ponysforest.system;

import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Box2dDebugRenderingSystem extends EntitySystem {

    private final Box2DDebugRenderer box2DDebugRenderer;
    private final World world;
    private final Stage stage;

    public Box2dDebugRenderingSystem(World world, Stage stage) {
        this.box2DDebugRenderer = new Box2DDebugRenderer();
        this.world = world;
        this.stage = stage;
    }

    @Override
    public void update(float deltaTime) {
        this.box2DDebugRenderer.render(this.world, this.stage.getCamera().combined);
    }
}
