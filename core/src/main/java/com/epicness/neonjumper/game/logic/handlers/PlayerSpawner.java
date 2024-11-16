package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.neonjumper.game.constants.GameConstants.PLAYER_GLOW_SIZE;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameHeight;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameWidth;

import com.badlogic.gdx.graphics.Camera;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class PlayerSpawner extends GameLogicHandler {

    private Player player;
    private Camera camera;

    @Override
    protected void init() {
        player = stuff.getPlayer();
        player.setX(gameWidth() / 2f - PLAYER_GLOW_SIZE / 2f);

        camera = screen.getDynamicCamera();
    }

    public void spawnPlayer() {
        player.setY(camera.position.y - gameHeight() / 2f + 200f);
    }
}