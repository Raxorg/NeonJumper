package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.neonjumper.game.constants.GameConstants.PLAYER_GLOW_SIZE;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.GAME_WIDTH;

import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class PlayerSpawner extends GameLogicHandler {

    private Player player;

    @Override
    protected void init() {
        player = stuff.getPlayer();
        player.setX(GAME_WIDTH / 2f - PLAYER_GLOW_SIZE / 2f);
    }

    public void spawnPlayer() {
        player.setY(200f);
    }
}