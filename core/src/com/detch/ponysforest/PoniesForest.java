package com.detch.ponysforest;

import com.badlogic.gdx.Game;
import com.detch.ponysforest.view.ForestLevel;

public class PoniesForest extends Game {

	private ForestLevel forestLevel;

	@Override
	public void create () {
		forestLevel = new ForestLevel();
		setScreen(forestLevel);
	}
}
