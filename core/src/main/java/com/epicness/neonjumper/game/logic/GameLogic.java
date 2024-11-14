package com.epicness.neonjumper.game.logic;

import com.epicness.fundamentals.logic.Logic;
import com.epicness.neonjumper.game.logic.handlers.DebugHandler;
import com.epicness.neonjumper.game.logic.handlers.JumpHandler;
import com.epicness.neonjumper.game.logic.handlers.VelocityMovementHandler;

public class GameLogic extends Logic {

    private final VelocityMovementHandler velocityMovementHandler;

    public GameLogic() {
        registerHandler(new DebugHandler());
        registerHandler(new JumpHandler());
        registerHandler(velocityMovementHandler = new VelocityMovementHandler());
    }

    @Override
    public void update() {
        velocityMovementHandler.update();
    }

    @Override
    public void resize(int width, int height) {
    }
}