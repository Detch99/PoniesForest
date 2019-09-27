package com.detch.ponysforest.service;

import com.badlogic.gdx.graphics.Texture;

public class AssetsManager {

    private static final String PONY_TEXTURE_PATH = "pony/pony.png";
    private static final String FOREST_TEXTURE_PATH = "forest/background.png";

    public static Texture getPonyTexture() {
        return new Texture(PONY_TEXTURE_PATH);
    }

    public static Texture getForestTexture() {
        return new Texture(FOREST_TEXTURE_PATH);
    }
}
