package com.detch.ponysforest.factories;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;

public abstract class EntityFactory {

    final PooledEngine engine;

    EntityFactory(PooledEngine engine) {
        this.engine = engine;
    }

    public abstract Entity createEntity();
}
