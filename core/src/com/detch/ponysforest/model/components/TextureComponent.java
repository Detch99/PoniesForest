package com.detch.ponysforest.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.Texture;

import lombok.Data;

@Data
public class TextureComponent implements Component {

    private Texture texture;

}
