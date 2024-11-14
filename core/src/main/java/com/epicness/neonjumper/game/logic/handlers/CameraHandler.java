package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.neonjumper.game.constants.GameConstants.MIN_VIEWPORT_WIDTH;

import com.epicness.neonjumper.game.logic.GameLogicHandler;

public class CameraHandler extends GameLogicHandler {

    public static float GAME_WIDTH, GAME_HEIGHT;

    @Override
    protected void init() {
        screen.staticCamera.position.x = MIN_VIEWPORT_WIDTH / 2f;
        GAME_WIDTH = screen.staticCamera.viewportWidth;
        GAME_HEIGHT = screen.staticCamera.viewportHeight;
    }
}