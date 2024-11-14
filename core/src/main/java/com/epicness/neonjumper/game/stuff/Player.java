package com.epicness.neonjumper.game.stuff;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.DualSprited;
import com.epicness.fundamentals.stuff.interfaces.Movable;
import com.epicness.fundamentals.stuff.shapes.bidimensional.CirclePlus;

public class Player implements Movable {

    private final DualSprited dualSprited;
    private final CirclePlus bounds;
    public final Vector2 speed;

    public Player(Sprite backgroundSprite, Sprite foregroundSprite) {
        dualSprited = new DualSprited(backgroundSprite, foregroundSprite);
        bounds = new CirclePlus();
        speed = new Vector2();
    }

    public void draw(SpriteBatch spriteBatch) {
        dualSprited.draw(spriteBatch);
    }

    public void drawDebug(ShapeDrawerPlus shapeDrawer) {
        bounds.draw(shapeDrawer);
    }

    @Override
    public float getX() {
        return dualSprited.getX();
    }

    @Override
    public void translateX(float amount) {
        dualSprited.translateX(amount);
        bounds.translateY(amount);
    }

    @Override
    public float getY() {
        return dualSprited.getY();
    }

    @Override
    public void translateY(float amount) {
        dualSprited.translateY(amount);
        bounds.translateY(amount);
    }
}
