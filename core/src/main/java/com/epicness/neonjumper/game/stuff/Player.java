package com.epicness.neonjumper.game.stuff;

import static com.badlogic.gdx.graphics.Color.CLEAR;
import static com.badlogic.gdx.graphics.Color.WHITE;
import static com.epicness.neonjumper.game.constants.GameConstants.PLAYER_GLOW_SIZE;
import static com.epicness.neonjumper.game.constants.GameConstants.PLAYER_RADIUS;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.fundamentals.stuff.interfaces.Movable;
import com.epicness.fundamentals.stuff.shapes.bidimensional.CirclePlus;

public class Player implements Movable {

    private final Sprited glow;
    private final CirclePlus circle;
    public final Vector2 speed;

    public Player(Sprite glowSprite) {
        glow = new Sprited(glowSprite);
        glow.setSize(PLAYER_GLOW_SIZE);

        circle = new CirclePlus(PLAYER_RADIUS, WHITE, CLEAR, 7f);
        circle.setCenterBasedPosition(glow.getCenter());
        speed = new Vector2();
    }

    public void draw(ShapeDrawerPlus shapeDrawer, SpriteBatch spriteBatch) {
        glow.draw(spriteBatch);
        circle.draw(shapeDrawer);
    }

    public void drawDebug(ShapeDrawerPlus shapeDrawer) {
        circle.draw(shapeDrawer);
    }

    @Override
    public float getX() {
        return glow.getX();
    }

    @Override
    public void translateX(float amount) {
        glow.translateX(amount);
        circle.translateX(amount);
    }

    @Override
    public float getY() {
        return glow.getY();
    }

    @Override
    public void translateY(float amount) {
        glow.translateY(amount);
        circle.translateY(amount);
    }
}
