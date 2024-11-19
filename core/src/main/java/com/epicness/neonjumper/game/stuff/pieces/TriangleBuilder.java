package com.epicness.neonjumper.game.stuff.pieces;

public class TriangleBuilder extends PieceBuilder {

    private final float halfSize;
    private final float height;

    public TriangleBuilder(float size) {
        halfSize = size / 2f;
        height = (float) (Math.sqrt(3f) / 2f * size);
    }

    @Override
    float[] makeVertices() {
        return new float[]{
            -halfSize, 0f,
            halfSize, 0f,
            0f, height
        };
    }
}