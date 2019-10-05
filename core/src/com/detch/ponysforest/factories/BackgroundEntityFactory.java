package com.detch.ponysforest.factories;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;
import com.detch.ponysforest.model.components.PositionComponent;
import com.detch.ponysforest.model.components.TextureComponent;
import com.detch.ponysforest.service.AssetsManager;

public class BackgroundEntityFactory extends EntityFactory {

    public BackgroundEntityFactory(PooledEngine engine) {
        super(engine);
    }

    @Override
    public Entity createEntity() {
        Entity background = engine.createEntity();

        TextureComponent textureComponent = engine.createComponent(TextureComponent.class);
        PositionComponent positionComponent = engine.createComponent(PositionComponent.class);

        textureComponent.setTexture(AssetsManager.getForestTexture());
        positionComponent.setPosition(0, 0);

        background.add(textureComponent);
        background.add(positionComponent);

        return background;
    }
}
