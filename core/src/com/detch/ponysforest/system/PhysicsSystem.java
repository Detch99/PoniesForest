package com.detch.ponysforest.system;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntityListener;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.ashley.core.Family;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.detch.ponysforest.model.components.PonyComponent;
import com.detch.ponysforest.model.components.WallsComponent;
import com.detch.ponysforest.model.hero.Pony;
import com.detch.ponysforest.model.world.Walls;
import com.detch.ponysforest.service.Mappers;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PhysicsSystem extends EntitySystem implements EntityListener {

    private World world;
    private Stage stage;
    private Pony pony;

    private final ComponentMapper<PonyComponent> ponyComponentMapper = Mappers.ponyMap;
    private final ComponentMapper<WallsComponent> wallsComponentMapper = Mappers.wallsMap;

    private final Vector2 FORCE_VECTOR = new Vector2(400, 0);
    private final Vector2 IMPULSE_VECTOR = new Vector2(0, 150);
    private final Vector2 POINT = new Vector2(new Vector2(0, 0));
    private final float BOX2D_UPDATE_STEP = 1 / 60f;

    public PhysicsSystem(World world, Stage stage) {
        this.world = world;
        this.stage = stage;
    }

    @Override
    public void addedToEngine(Engine engine) {
        engine.addEntityListener(Family.one(
                PonyComponent.class,
                WallsComponent.class).get(), this);
    }

    @Override
    public void update(float deltaTime) {
        this.stage.act(deltaTime);
        this.stage.draw();

        applyForceToCenter(pony);
        if (Gdx.input.isTouched()) {
            setImpulse(pony);
        }

        this.stage.getCamera().position.set(pony.getBody().getPosition().x, this.stage.getCamera().position.y, 0);
        this.world.step(BOX2D_UPDATE_STEP, 4, 4);
    }

    @Override
    public void entityAdded(Entity entity) {
        if (ponyComponentMapper.has(entity)) {
            Pony pony = ponyComponentMapper.get(entity).getActor();
            this.pony = pony;
            this.stage.addActor(pony);
        } else if (wallsComponentMapper.has(entity)) {
            Walls walls = wallsComponentMapper.get(entity).getActor();
            this.stage.addActor(walls);
        }
    }

    @Override
    public void entityRemoved(Entity entity) { }

    private void setImpulse(Pony pony) {
        pony.getBody().applyLinearImpulse(IMPULSE_VECTOR, POINT, true);
    }

    private void applyForceToCenter(Pony pony) {
        pony.getBody().applyForceToCenter(FORCE_VECTOR, true);
    }

}
