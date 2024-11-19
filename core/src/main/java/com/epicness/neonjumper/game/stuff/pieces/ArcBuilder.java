package com.epicness.neonjumper.game.stuff.pieces;

import com.badlogic.gdx.math.MathUtils;

public class ArcBuilder extends PieceBuilder {

    private final float arcAngle, outerRadius, innerRadius;

    public ArcBuilder(float arcAngle, float outerRadius, float innerRadius) {
        this.arcAngle = arcAngle;
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }

    public ArcBuilder() {
        this(90f, 100f, 80f);
    }

    @Override
    float[] makeVertices() {
        float[] vertices = new float[32];
        for (int i = 0; i < 16; i++) {
            float vertAngle = arcAngle * i / 14f;
            vertices[i++] = outerRadius * MathUtils.cosDeg(vertAngle);  // x
            vertices[i] = outerRadius * MathUtils.sinDeg(vertAngle);    // y
        }
        for (int i = 0, v = 30; i < 16; i += 2, v -= 3) {
            float vertAngle = arcAngle * i / 14f;
            vertices[v++] = innerRadius * MathUtils.cosDeg(vertAngle);  // x
            vertices[v] = innerRadius * MathUtils.sinDeg(vertAngle);    // y
        }
        return vertices;
    }
}