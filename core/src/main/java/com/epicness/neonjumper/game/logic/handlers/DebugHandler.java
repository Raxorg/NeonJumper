package com.epicness.neonjumper.game.logic.handlers;

import static com.badlogic.gdx.Input.Keys.D;

import com.epicness.neonjumper.game.logic.GameLogicHandler;

public class DebugHandler extends GameLogicHandler {

    public static boolean debug;

    @Override
    protected void init() {
        debug = false;
    }

    @Override
    public void keyDown(int keycode) {
        if (keycode != D) return;

        debug = !debug;
    }
}