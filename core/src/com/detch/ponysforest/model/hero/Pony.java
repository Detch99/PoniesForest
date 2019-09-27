package com.detch.ponysforest.model.hero;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.detch.ponysforest.service.AssetsManager;

public class Pony {

    private Sprite sprite;

    public Pony() {
        sprite = new Sprite();
        sprite.setRegion(AssetsManager.getPonyTexture());
        sprite.setPosition(0, 0);
    }

    public Sprite getSprite() {
        return sprite;
    }
}
