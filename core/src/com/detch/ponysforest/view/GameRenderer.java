package com.detch.ponysforest.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.detch.ponysforest.model.world.GameWorld;

public class GameRenderer {

    public static int SCREEN_HEIGHT;
    public static int SCREEN_WIDTH;

    private SpriteBatch batch;
    private GameWorld gameWorld;
    private OrthographicCamera camera;



    public GameRenderer(GameWorld gameWorld) {
        SCREEN_WIDTH = Gdx.graphics.getWidth();
        SCREEN_HEIGHT = Gdx.graphics.getHeight();
        batch = new SpriteBatch();
        this.gameWorld = gameWorld;
        camera = new OrthographicCamera();
        camera.position.set(0, 0, 0);
    }

    public void render(){
        batch.begin();
        gameWorld.getForest().draw(batch, SCREEN_WIDTH, SCREEN_HEIGHT);
        batch.end();
    }




}
