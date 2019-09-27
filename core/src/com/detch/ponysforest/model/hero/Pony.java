package com.detch.ponysforest.model.hero;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Pony {

    private Sprite sprite;

    public Pony(){
        sprite = new Sprite();
        sprite.setRegion(new Texture("pony/pony.png"));
        sprite.setPosition(0, 0);
    }

    public Sprite getSprite() {
        return sprite;
    }
}
