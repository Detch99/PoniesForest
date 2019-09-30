package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class PonyComponent implements Component {

    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
