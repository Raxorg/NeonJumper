package com.epicness.neonjumper.game.logic.handlers;

import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class JumpHandler extends GameLogicHandler {

    private Player player;

    @Override
    protected void init() {
        player = stuff.getPlayer();
    }

    @Override
    public void touchDown(float x, float y, int button) {
        get(GravityHandler.class).enable();
        player.speed.y = 700f;
    }
}
