package com.epicness.neonjumper.game.stuff;

import static com.badlogic.gdx.graphics.Color.CLEAR;
import static com.badlogic.gdx.graphics.Color.WHITE;

import com.badlogic.gdx.graphics.Color;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.interfaces.Movable;
import com.epicness.fundamentals.stuff.shapes.bidimensional.PolygonPlus;

public class Obstacle implements Movable {

    private final PolygonPlus bounds;
    private float height;

    public Obstacle(float[] vertices) {
        bounds = new PolygonPlus(vertices, 3f, WHITE, CLEAR);

        for (int i = 1; i < vertices.length; i += 2) {
            height = Math.max(vertices[i], height);
        }
    }

    public void draw(ShapeDrawerPlus shapeDrawer) {
        bounds.draw(shapeDrawer);
    }

    @Override
    public float getX() {
        return bounds.getX();
    }

    @Override
    public void translateX(float amount) {
        bounds.translateX(amount);
    }

    @Override
    public float getY() {
        return bounds.getY();
    }

    @Override
    public void translateY(float amount) {
        bounds.translateY(amount);
    }

    public float getHeight() {
        return height;
    }

    public void setBorderColor(Color color) {
        bounds.setBorderColor(color);
    }

    public PolygonPlus getBounds() {
        return bounds;
    }
}