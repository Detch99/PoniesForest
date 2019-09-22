package com.detch.ponysforest;

import com.badlogic.gdx.Game;
import com.detch.ponysforest.gameController.GameController;

public class PonysForest extends Game {

	private GameController gc;

	
	@Override
	public void create () {
		gc = new GameController();
		setScreen(gc);
	}
}
