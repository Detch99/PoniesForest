package com.detch.ponysforest.view;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.detch.ponysforest.model.world.GameWorld;

public class GameRenderer {

    private GameWorld gameWorld;
    private OrthographicCamera camera;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        camera = new OrthographicCamera();
        camera.position.set(0, 0, 0);
    }

    public void render(){
        gameWorld.render();
    }




}
