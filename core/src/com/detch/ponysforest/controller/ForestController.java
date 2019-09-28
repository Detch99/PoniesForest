package com.detch.ponysforest.controller;

import com.badlogic.gdx.math.Vector2;
import com.detch.ponysforest.model.hero.Pony;

public class ForestController {

    public void setImpulse(Pony pony){
        pony.getBody().applyLinearImpulse(new Vector2(0, 150), new Vector2(0, 0), true);
    }

}
