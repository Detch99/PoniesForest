package com.detch.ponysforest.view;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.detch.ponysforest.model.hero.Pony;
import com.detch.ponysforest.service.AssetsManager;

public class ForestLevel implements Screen {

    private Texture background;
    private SpriteBatch batch;
    private OrthographicCamera camera;
    private World world;
    private Stage stage;
    private Pony pony;

    @Override
    public void show() {
        background = AssetsManager.getForestTexture();
        pony = new Pony();
        camera = new OrthographicCamera();
        world = new World(new Vector2(20, 20), true);
        stage = new Stage();
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {
        camera.update();
        batch.begin();
        batch.draw(background, 0, 0);
        batch.draw(pony.getSprite(), pony.getSprite().getX(), pony.getSprite().getY());
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
