package com.epicness.neonjumper.game.constants;

import com.badlogic.gdx.Gdx;

public class GameConstants {

    private static final float RATIO = (float) Gdx.graphics.getWidth() / Gdx.graphics.getHeight();
    public static final float MIN_VIEWPORT_HEIGHT = 1000f;
    public static final float MIN_VIEWPORT_WIDTH = MIN_VIEWPORT_HEIGHT * RATIO;

    public static final float PLAYER_GLOW_SIZE = 100f;
    public static final float PLAYER_RADIUS = PLAYER_GLOW_SIZE / 6f;
}