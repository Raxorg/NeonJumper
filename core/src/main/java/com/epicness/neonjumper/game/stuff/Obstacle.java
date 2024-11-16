package com.epicness.neonjumper.game.stuff;

import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.interfaces.Movable;
import com.epicness.fundamentals.stuff.shapes.bidimensional.PolygonPlus;

public class Obstacle implements Movable {

    private final PolygonPlus bounds;

    public Obstacle(float[] vertices) {
        bounds = new PolygonPlus(vertices);
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
}