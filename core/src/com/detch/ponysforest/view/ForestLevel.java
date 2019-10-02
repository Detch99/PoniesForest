package com.detch.ponysforest.view;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.ScreenAdapter;
import com.detch.ponysforest.PoniesForest;
import com.detch.ponysforest.service.BackgroundEntityFactory;

public class ForestLevel extends ScreenAdapter {

    private PoniesForest game;
    private BackgroundEntityFactory backgroundEntityFactory;

    public ForestLevel(PoniesForest game) {
        this.game = game;
        this.backgroundEntityFactory = new BackgroundEntityFactory(game.getEngine());
    }

    @Override
    public void show() {
        Entity backgroundEntity = backgroundEntityFactory.createEntity();
        game.getEngine().addEntity(backgroundEntity);
    }

    @Override
    public void render(float delta) {
        game.getEngine().update(delta);
    }
}
