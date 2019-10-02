package com.detch.ponysforest.system;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.detch.ponysforest.model.hero.Pony;

public class PhysicsSystem extends EntitySystem {

    private World world;
    private Stage stage;
    private Box2DDebugRenderer renderer;
    private Pony pony;

    private final Vector2 EARTH_GRAVITY_VECTOR = new Vector2(0, -9.8f);
    private final Vector2 FORCE_VECTOR = new Vector2(400, 0);
    private final Vector2 IMPULSE_VECTOR = new Vector2(0, 150);
    private final Vector2 POINT = new Vector2(new Vector2(0, 0));

    public PhysicsSystem() {
//        world = new World(EARTH_GRAVITY_VECTOR, true);
//        y = 20/((float)Gdx.graphics.getWidth()/(float)Gdx.graphics.getHeight());
//        renderer = new Box2DDebugRenderer();
//        stage = new Stage(new FitViewport(20, y));
//
//        pony = new Pony(5, 7, world);
//        walls = new Walls(world);
//        stage.addActor(pony);
//        stage.addActor(walls);
//        stage.setDebugAll(true);
//
//        System.out.println(y);
    }

    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);
//        renderer.render(world, stage.getCamera().combined);
//        world.step(1 / 60f, 4, 4);
//        stage.act(deltaTime);
//        stage.draw();
//
//        forestController.applyForceToCenter(pony);
//        stage.getCamera().position.set(pony.getBody().getPosition().x, stage.getCamera().position.y, 0);
//
//        if (Gdx.input.isTouched()) {
//            forestController.setImpulse(pony);
//        }
    }

    public void setImpulse(Pony pony) {
        pony.getBody().applyLinearImpulse(IMPULSE_VECTOR, POINT, true);
    }

    public void applyForceToCenter(Pony pony) {
        pony.getBody().applyForceToCenter(FORCE_VECTOR, true);
    }

}
