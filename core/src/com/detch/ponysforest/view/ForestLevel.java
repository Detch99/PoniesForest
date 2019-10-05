package com.detch.ponysforest.view;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.detch.ponysforest.PoniesForest;
import com.detch.ponysforest.factories.BackgroundEntityFactory;
import com.detch.ponysforest.factories.PonyEntityFactory;
import com.detch.ponysforest.factories.WallsEntityFactory;
import com.detch.ponysforest.system.PhysicsSystem;

public class ForestLevel extends ScreenAdapter {

    private final PoniesForest game;
    private final BackgroundEntityFactory backgroundEntityFactory;
    private final PonyEntityFactory ponyEntityFactory;
    private final WallsEntityFactory wallsEntityFactory;

    public ForestLevel(PoniesForest game) {
        this.game = game;
        this.backgroundEntityFactory = new BackgroundEntityFactory(game.getEngine());
        this.ponyEntityFactory = new PonyEntityFactory(game.getEngine());
        this.wallsEntityFactory = new WallsEntityFactory(game.getEngine());
    }

    @Override
    public void show() {
        Entity backgroundEntity = backgroundEntityFactory.createEntity();
        World world = game.getEngine().getSystem(PhysicsSystem.class).getWorld();
        Entity ponyEntity = ponyEntityFactory.createEntity(new Vector2(5, 7), world);
        Entity wallsEntity = wallsEntityFactory.createEntity(new Vector2(0, 0), world);

        game.getEngine().addEntity(backgroundEntity);
        game.getEngine().addEntity(ponyEntity);
        game.getEngine().addEntity(wallsEntity);
    }

    @Override
    public void render(float delta) {
        game.getEngine().update(delta);
    }
}
