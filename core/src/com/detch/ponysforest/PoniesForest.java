package com.detch.ponysforest;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.detch.ponysforest.system.RenderingSystem;
import com.detch.ponysforest.view.ForestLevel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PoniesForest extends Game {

	private SpriteBatch spriteBatch;
	private PooledEngine engine;

	@Override
	public void create () {
		spriteBatch = new SpriteBatch();
		engine = new PooledEngine();
		engine.addSystem(new RenderingSystem(spriteBatch));
		setScreen(new ForestLevel(this));
	}
}
