package com.detch.ponysforest.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.detch.ponysforest.model.hero.Pony;
import com.detch.ponysforest.service.AssetsManager;

public class ForestLevel implements Screen {

    private Texture background;
    private SpriteBatch batch;
    private OrthographicCamera camera;
    private Box2DDebugRenderer renderer;
    private World world;
    private Stage stage;
    private Pony pony;

    @Override
    public void show() {
        background = AssetsManager.getForestTexture();
        world = new World(new Vector2(0, -9.8f), true);
        pony = new Pony(0, 15, world);
        camera = new OrthographicCamera(20,15);
        camera.position.set(10, 7.5f, 0);
        renderer = new Box2DDebugRenderer();
        stage = new Stage();
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        world.step(1/60f, 4, 4);
        batch.begin();
        batch.draw(background, 0, 0);
        batch.draw(pony.getSprite(), pony.getBody().getPosition().x, pony.getBody().getPosition().y);
        batch.end();
        renderer.render(world, camera.combined);

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
