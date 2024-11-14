package com.epicness.neonjumper.game.logic.handlers;

import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class GravityHandler extends GameLogicHandler {

    private Player player;

    @Override
    protected void init() {
        player = stuff.getPlayer();
    }

    public void applyGravity(float delta) {
        player.speed.y -= 1000f * delta;
    }
}