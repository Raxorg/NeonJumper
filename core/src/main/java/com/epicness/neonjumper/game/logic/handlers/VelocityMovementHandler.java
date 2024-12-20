package com.epicness.neonjumper.game.logic.handlers;

import com.badlogic.gdx.math.Vector2;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Player;

public class VelocityMovementHandler extends GameLogicHandler {

    private Player player;
    private Vector2 aux;

    @Override
    protected void init() {
        player = stuff.getPlayer();
        aux = new Vector2();
    }

    public void movePlayer(float delta) {
        player.translate(aux.set(player.speed).scl(delta));
        get(ScoreHandler.class).updateScore(player.getY());
    }
}