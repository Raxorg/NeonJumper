package com.epicness.neonjumper.game.constants;

import com.badlogic.gdx.math.MathUtils;

public class GameConstants {

    public static final float PLAYER_GLOW_SIZE = 50f;
    public static final float PLAYER_RADIUS = PLAYER_GLOW_SIZE / 6f;
    public static final float[] TRIANGLE_VERTS, ARC_90_VERTS;

    static {
        TRIANGLE_VERTS = new float[]{
            0f, 0f,
            100f, 0f,
            50f, 100f
        };

        ARC_90_VERTS = new float[32];
        float arcAngle = 90f;
        float outerRadius = 50f;
        float innerRadius = outerRadius - 15f;
        for (int i = 0; i < 16; i++) {
            float vertAngle = arcAngle * i / 14f;
            ARC_90_VERTS[i++] = outerRadius * MathUtils.cosDeg(vertAngle);  // x
            ARC_90_VERTS[i] = outerRadius * MathUtils.sinDeg(vertAngle);    // y
        }
        ARC_90_VERTS[16] = 0f;
        ARC_90_VERTS[17] = innerRadius;
        for (int i = 0, v = 30; i < 14; i += 2, v -= 3) {
            float vertAngle = arcAngle * i / 14f;
            ARC_90_VERTS[v++] = innerRadius * MathUtils.cosDeg(vertAngle);  // x
            ARC_90_VERTS[v] = innerRadius * MathUtils.sinDeg(vertAngle);    // y
        }
    }
}