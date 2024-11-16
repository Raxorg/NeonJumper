package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.neonjumper.game.constants.GameConstants.PLAYER_GLOW_SIZE;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameHeight;

import com.badlogic.gdx.graphics.Camera;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class BottomChecker extends GameLogicHandler {

    private Player player;
    private Camera camera;

    @Override
    protected void init() {
        player = stuff.getPlayer();
        camera = screen.getDynamicCamera();
    }

    public void checkBottom() {
        if (player.getY() < camera.position.y - gameHeight() / 2f - PLAYER_GLOW_SIZE) {
            player.speed.setZero();
            get(PlayerSpawner.class).spawnPlayer();
        }
    }
}