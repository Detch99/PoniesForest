package com.detch.ponysforest.model.world;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Forest {

    private Texture background;
    private Texture trees;

    public Forest(){
        createForest();
    }

    public void createForest() {
        background = new Texture("forest/background.png");
        trees = new Texture("forest/trees.png");
    }

    public void draw(SpriteBatch batch, int width, int height) {
        batch.draw(background, 0, 0, width, height);
        batch.draw(trees, 0, 0, width, height);
    }

    public Texture getBackground() {
        return background;
    }

    public Texture getTrees() {
        return trees;
    }
}
