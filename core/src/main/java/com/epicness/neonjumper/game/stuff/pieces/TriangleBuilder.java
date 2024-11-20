package com.epicness.neonjumper.game.stuff.pieces;

public class TriangleBuilder extends PieceBuilder {

    private final float halfSize, height, yShift;

    public TriangleBuilder(float size) {
        halfSize = size / 2f;
        height = (float) (Math.sqrt(3f) / 2f * size);
        yShift = -height / 3f;
    }

    @Override
    float[] makeVertices() {
        return new float[]{
            -halfSize, yShift,
            halfSize, yShift,
            0f, height + yShift
        };
    }
}