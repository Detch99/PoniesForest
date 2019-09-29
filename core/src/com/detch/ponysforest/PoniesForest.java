package com.detch.ponysforest;

import com.badlogic.gdx.Game;
import com.detch.ponysforest.controller.ForestController;
import com.detch.ponysforest.view.ForestLevel;

public class PoniesForest extends Game {

	@Override
	public void create () {
		setScreen(new ForestLevel(new ForestController()));
	}
}
