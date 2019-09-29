package com.detch.ponysforest.model.hero;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.detch.ponysforest.model.BaseActor;
import com.detch.ponysforest.service.AssetsManager;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public class Pony extends BaseActor {

    private Sprite sprite;
    private Vector2 position;

    public Pony(float x, float y, World world) {
        super(world);
        sprite = new Sprite();
        position = new Vector2(x, y);

        sprite.setRegion(AssetsManager.getPonyTexture());
        sprite.setPosition(position.x, position.y);
        setPosition(position.x, position.y);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(1,1);

        createBody(shape, BodyDef.BodyType.DynamicBody);
    }

    public Sprite getSprite() {
        return sprite;
    }
}
