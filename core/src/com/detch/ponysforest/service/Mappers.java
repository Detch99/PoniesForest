package com.detch.ponysforest.service;

import com.badlogic.ashley.core.ComponentMapper;
import com.detch.ponysforest.model.components.BodyComponent;
import com.detch.ponysforest.model.components.BodyDefComponent;
import com.detch.ponysforest.model.components.FictureDefComponent;
import com.detch.ponysforest.model.components.PonyComponent;
import com.detch.ponysforest.model.components.PositionComponent;
import com.detch.ponysforest.model.components.ShapeComponent;
import com.detch.ponysforest.model.components.SpriteComponent;

public final class Mappers {

    public static ComponentMapper<BodyComponent> bodyMap = ComponentMapper.getFor(BodyComponent.class);
    public static ComponentMapper<BodyDefComponent> bodyDefMap = ComponentMapper.getFor(BodyDefComponent.class);
    public static ComponentMapper<FictureDefComponent> fictureDefMap = ComponentMapper.getFor(FictureDefComponent.class);
    public static ComponentMapper<PonyComponent> ponyMap = ComponentMapper.getFor(PonyComponent.class);
    public static ComponentMapper<PositionComponent> positionMap = ComponentMapper.getFor(PositionComponent.class);
    public static ComponentMapper<ShapeComponent> shapeMap = ComponentMapper.getFor(ShapeComponent.class);
    public static ComponentMapper<SpriteComponent> spriteMap = ComponentMapper.getFor(SpriteComponent.class);

}
