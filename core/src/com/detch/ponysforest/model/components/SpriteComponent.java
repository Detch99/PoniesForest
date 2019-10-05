package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.Sprite;

import lombok.Data;

@Data
public class SpriteComponent implements Component {

    private Sprite sprite;

}
