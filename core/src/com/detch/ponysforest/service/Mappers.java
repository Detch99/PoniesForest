package com.detch.ponysforest.service;

import com.badlogic.ashley.core.ComponentMapper;
import com.detch.ponysforest.model.components.PonyComponent;
import com.detch.ponysforest.model.components.PositionComponent;
import com.detch.ponysforest.model.components.TextureComponent;
import com.detch.ponysforest.model.components.WallsComponent;

public final class Mappers {

    public static final ComponentMapper<PonyComponent> ponyMap = ComponentMapper.getFor(PonyComponent.class);
    public static final ComponentMapper<PositionComponent> positionMap = ComponentMapper.getFor(PositionComponent.class);
    public static final ComponentMapper<TextureComponent> textureMap = ComponentMapper.getFor(TextureComponent.class);
    public static final ComponentMapper<WallsComponent> wallsMap = ComponentMapper.getFor(WallsComponent.class);

}
