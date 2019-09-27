package com.detch.ponysforest.model.hero;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.detch.ponysforest.service.AssetsManager;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public class Pony {

    private Sprite sprite;
    private Body body;
    private Vector2 position;
    private World world;

    public Pony(float x, float y, World world) {
        sprite = new Sprite();
        position = new Vector2(x, y);
        this.world = world;

        sprite.setRegion(AssetsManager.getPonyTexture());
        sprite.setPosition(position.x, position.y);

        createBody();
    }

    private void createBody() {
        BodyDef bodyDef = new BodyDef();
        FixtureDef fixtureDef = new FixtureDef();
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(2,2);

        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(position);
        body = world.createBody(bodyDef);

        fixtureDef.shape = shape;
        fixtureDef.density = 5;
        fixtureDef.restitution = 1f;
        body.createFixture(fixtureDef);
        body.setUserData(sprite);
    }

    public Body getBody() {
        return body;
    }

    public Sprite getSprite() {
        return sprite;
    }
}
