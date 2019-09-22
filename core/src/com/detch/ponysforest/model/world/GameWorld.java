package com.detch.ponysforest.model.world;

public class GameWorld {


    private Forest forest;

    public GameWorld() {
        forest = new Forest();
        forest.createForest();
    }

    public Forest getForest() {
        return forest;
    }
}
