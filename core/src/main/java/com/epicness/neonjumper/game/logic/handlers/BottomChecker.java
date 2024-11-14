package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.neonjumper.game.constants.GameConstants.PLAYER_RADIUS;

import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class BottomChecker extends GameLogicHandler {

    private Player player;

    @Override
    protected void init() {
        player = stuff.getPlayer();
    }

    public void checkBottom() {
        if (player.getY() <= -PLAYER_RADIUS * 2f) {
            player.speed.setZero();
            get(PlayerSpawner.class).spawnPlayer();
        }
    }
}