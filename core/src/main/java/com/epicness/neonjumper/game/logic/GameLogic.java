package com.epicness.neonjumper.game.logic;

import com.epicness.fundamentals.logic.Logic;
import com.epicness.neonjumper.game.logic.handlers.DebugHandler;
import com.epicness.neonjumper.game.logic.handlers.GravityHandler;
import com.epicness.neonjumper.game.logic.handlers.JumpHandler;
import com.epicness.neonjumper.game.logic.handlers.ObstacleGenerator;
import com.epicness.neonjumper.game.logic.handlers.PlayerMovementHandler;
import com.epicness.neonjumper.game.logic.handlers.VelocityMovementHandler;

public class GameLogic extends Logic {

    private final PlayerMovementHandler playerMovementHandler;

    public GameLogic() {
        registerHandler(new DebugHandler());
        registerHandler(new GravityHandler());
        registerHandler(new JumpHandler());
        registerHandler(new ObstacleGenerator());
        registerHandler(playerMovementHandler = new PlayerMovementHandler());
        registerHandler(new VelocityMovementHandler());
    }

    @Override
    public void update() {
        playerMovementHandler.update();
    }

    @Override
    public void resize(int width, int height) {
    }
}