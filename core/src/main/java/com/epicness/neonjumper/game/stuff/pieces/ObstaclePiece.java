package com.epicness.neonjumper.game.stuff.pieces;

import static com.badlogic.gdx.graphics.Color.CLEAR;
import static com.badlogic.gdx.graphics.Color.WHITE;

import com.badlogic.gdx.graphics.Color;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.interfaces.HasMovable;
import com.epicness.fundamentals.stuff.interfaces.HasRotatable;
import com.epicness.fundamentals.stuff.interfaces.Movable;
import com.epicness.fundamentals.stuff.interfaces.Rotatable;
import com.epicness.fundamentals.stuff.shapes.bidimensional.PolygonPlus;

public class ObstaclePiece implements HasMovable, HasRotatable {

    private final PolygonPlus shape;
    private final float height;

    public ObstaclePiece(PieceBuilder pieceBuilder) {
        float[] vertices = pieceBuilder.makeVertices();
        shape = new PolygonPlus(vertices, 3f, WHITE, CLEAR);
        float maxHeight = 0f;
        for (int i = 1; i < vertices.length; i += 2) {
            maxHeight = Math.max(vertices[i], maxHeight);
        }
        height = maxHeight;
    }

    public void draw(ShapeDrawerPlus shapeDrawer) {
        shape.draw(shapeDrawer);
    }

    @Override
    public Movable getMovable() {
        return shape;
    }

    @Override
    public Rotatable getRotatable() {
        return shape;
    }

    public float getHeight() {
        return height * shape.getScaleY();
    }

    public void setBorderColor(Color color) {
        shape.setBorderColor(color);
    }

    public PolygonPlus getBounds() {
        return shape;
    }
}