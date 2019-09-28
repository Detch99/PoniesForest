package com.detch.ponysforest.model.hero;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.detch.ponysforest.model.BaseActor;
import com.detch.ponysforest.service.AssetsManager;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public class Pony extends BaseActor {

    private Sprite sprite;
    private Vector2 position;
    private World world;

    public Pony(float x, float y, World world) {
        super(world);
        sprite = new Sprite();
        position = new Vector2(x, y);
        this.world = world;

        sprite.setRegion(AssetsManager.getPonyTexture());
        sprite.setPosition(position.x, position.y);
        setPosition(position.x, position.y);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(1,1);

        createBody(shape, BodyDef.BodyType.DynamicBody);
    }

    /*private void createBody() {
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
        //body.setUserData(sprite);
    }*/

    public Sprite getSprite() {
        return sprite;
    }
}
