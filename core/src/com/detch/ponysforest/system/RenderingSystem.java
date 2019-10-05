package com.detch.ponysforest.system;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.detch.ponysforest.model.components.PositionComponent;
import com.detch.ponysforest.model.components.TextureComponent;
import com.detch.ponysforest.service.Mappers;

public class RenderingSystem extends IteratingSystem {

    private SpriteBatch spriteBatch;

    private ComponentMapper<TextureComponent> textureMapper = Mappers.textureMap;
    private ComponentMapper<PositionComponent> positionMapper = Mappers.positionMap;

    private final Array<Entity> renderQueue = new Array<>();

    public RenderingSystem(SpriteBatch spriteBatch) {
        super(Family.all(TextureComponent.class, PositionComponent.class).get());
        this.spriteBatch = spriteBatch;
    }

    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        for (Entity entity: renderQueue) {
            TextureComponent textureComponent = textureMapper.get(entity);
            PositionComponent positionComponent = positionMapper.get(entity);
            spriteBatch.begin();
            spriteBatch.draw(
                    textureComponent.getTexture(),
                    positionComponent.getX(),
                    positionComponent.getY()
            );
            spriteBatch.end();
        }

        renderQueue.clear();
    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {
        renderQueue.add(entity);
    }
}
