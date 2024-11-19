package com.epicness.neonjumper.game.constants;

public class GameConstants {

    public static final float PLAYER_GLOW_SIZE = 50f;
    public static final float PLAYER_RADIUS = PLAYER_GLOW_SIZE / 6f;
    public static final float[] TRIANGLE_VERTS;

    static {
        TRIANGLE_VERTS = new float[]{
            0f, 0f,
            100f, 0f,
            50f, 100f
        };
    }
}