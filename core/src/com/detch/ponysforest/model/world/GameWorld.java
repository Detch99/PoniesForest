package com.detch.ponysforest.model.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameWorld {

    private SpriteBatch batch;
    private Forest forest;

    public GameWorld() {
        batch = new SpriteBatch();
        forest = new Forest();
        forest.createForest();
    }

    public void render(){
        batch.begin();
        forest.draw(batch);
        batch.end();
    }

}
