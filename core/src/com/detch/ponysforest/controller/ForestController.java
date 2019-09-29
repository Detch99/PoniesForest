package com.detch.ponysforest.controller;

import com.badlogic.gdx.math.Vector2;
import com.detch.ponysforest.model.hero.Pony;

public class ForestController {

    private final Vector2 FORCE_VECTOR = new Vector2(400, 0);
    private final Vector2 IMPULSE_VECTOR = new Vector2(0, 150);
    private final Vector2 POINT = new Vector2(new Vector2(0, 0));

    public void setImpulse(Pony pony) {
        pony.getBody().applyLinearImpulse(IMPULSE_VECTOR, POINT, true);
    }

    public void applyForceToCenter(Pony pony) {
        pony.getBody().applyForceToCenter(FORCE_VECTOR, true);
    }

}
