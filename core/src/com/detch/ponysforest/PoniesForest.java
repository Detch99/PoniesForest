package com.detch.ponysforest;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.detch.ponysforest.system.Box2dDebugRenderingSystem;
import com.detch.ponysforest.system.PhysicsSystem;
import com.detch.ponysforest.system.RenderingSystem;
import com.detch.ponysforest.view.ForestLevel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PoniesForest extends Game {

	private SpriteBatch spriteBatch;
	private World world;
	private Stage stage;
	private PooledEngine engine;

	private final Vector2 EARTH_GRAVITY_VECTOR = new Vector2(0, -9.8f);

	@Override
	public void create () {
		this.spriteBatch = new SpriteBatch();
		this.engine = new PooledEngine();
		initBox2D();
		initSystems();
		setScreen(new ForestLevel(this));
	}

	private void initBox2D() {
		this.world = new World(EARTH_GRAVITY_VECTOR, true);
		float y = 20 / ((float) Gdx.graphics.getWidth() / (float) Gdx.graphics.getHeight());
		this.stage = new Stage(new FitViewport(20, y));
		this.stage.setDebugAll(true);
	}

	private void initSystems() {
		this.engine.addSystem(new RenderingSystem(this.spriteBatch));
		this.engine.addSystem(new PhysicsSystem(this.world, this.stage));
		this.engine.addSystem(new Box2dDebugRenderingSystem(this.world, this.stage));
	}
}
