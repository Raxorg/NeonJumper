package com.epicness.neonjumper.game.logic.handlers;

import com.badlogic.gdx.graphics.Camera;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class CameraHandler extends GameLogicHandler {

    private Player player;
    private Camera camera;

    @Override
    protected void init() {
        player = stuff.getPlayer();
        camera = screen.getDynamicCamera();
    }

    public void followPlayer() {
        float diff = camera.position.y - 150f - player.getY();
        if (diff < 0f) {
            camera.position.y -= diff;
        }
    }
}