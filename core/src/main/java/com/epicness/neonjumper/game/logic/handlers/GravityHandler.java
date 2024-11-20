package com.epicness.neonjumper.game.logic.handlers;

import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class GravityHandler extends GameLogicHandler {

    private Player player;
    private boolean enabled;

    @Override
    protected void init() {
        player = stuff.getPlayer();
        enabled = false;
    }

    public void applyGravity(float delta) {
        if (!enabled) return;

        player.speed.y -= 2000f * delta;
    }

    public void enable() {
        enabled = true;
    }
}