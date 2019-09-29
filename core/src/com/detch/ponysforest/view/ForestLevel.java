package com.detch.ponysforest.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.detch.ponysforest.controller.ForestController;
import com.detch.ponysforest.model.hero.Pony;
import com.detch.ponysforest.model.world.Walls;
import com.detch.ponysforest.service.AssetsManager;

public class ForestLevel implements Screen {

    private ForestController forestController;
    private Texture background;
    private final SpriteBatch batch = new SpriteBatch();
    private Box2DDebugRenderer renderer;
    private World world;
    private Stage stage;
    private Pony pony;
    private Walls walls;
    private float y;

    private final Vector2 EARTH_GRAVITY_VECTOR = new Vector2(0, -9.8f);

    public ForestLevel(ForestController forestController) {
        this.forestController = forestController;
    }

    @Override
    public void show() {
        background = AssetsManager.getForestTexture();
        world = new World(EARTH_GRAVITY_VECTOR, true);
        y = 20/((float)Gdx.graphics.getWidth()/(float)Gdx.graphics.getHeight());
        renderer = new Box2DDebugRenderer();
        stage = new Stage(new FitViewport(20, y));

        pony = new Pony(5, 7, world);
        walls = new Walls(world);
        stage.addActor(pony);
        stage.addActor(walls);
        stage.setDebugAll(true);

        System.out.println(y);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(background, 0, 0);
        //batch.draw(pony.getSprite(), pony.getBody().getPosition().x*y*5, pony.getBody().getPosition().y*y*5);
        batch.end();

        renderer.render(world, stage.getCamera().combined);
        world.step(1/60f, 4, 4);
        stage.act(delta);
        stage.draw();

        forestController.applyForceToCenter(pony);
        stage.getCamera().position.set(pony.getBody().getPosition().x, stage.getCamera().position.y, 0);

        if (Gdx.input.isTouched()) {
            forestController.setImpulse(pony);
        }

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
