package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.scenes.scene2d.Actor;

import lombok.Data;

@Data
public class PonyComponent implements Component {

    private Actor actor;

}
