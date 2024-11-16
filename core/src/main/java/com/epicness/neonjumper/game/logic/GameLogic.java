package com.epicness.neonjumper.game.logic;

import com.epicness.fundamentals.logic.Logic;
import com.epicness.neonjumper.game.logic.handlers.BottomChecker;
import com.epicness.neonjumper.game.logic.handlers.CameraHandler;
import com.epicness.neonjumper.game.logic.handlers.DebugHandler;
import com.epicness.neonjumper.game.logic.handlers.GravityHandler;
import com.epicness.neonjumper.game.logic.handlers.JumpHandler;
import com.epicness.neonjumper.game.logic.handlers.ObstacleGenerator;
import com.epicness.neonjumper.game.logic.handlers.ObstacleMover;
import com.epicness.neonjumper.game.logic.handlers.PlayerMovementHandler;
import com.epicness.neonjumper.game.logic.handlers.PlayerSpawner;
import com.epicness.neonjumper.game.logic.handlers.VelocityMovementHandler;

public class GameLogic extends Logic {

    private final ObstacleGenerator obstacleGenerator;
    private final ObstacleMover obstacleMover;
    private final PlayerMovementHandler playerMovementHandler;

    public GameLogic() {
        registerHandler(new BottomChecker());
        registerHandler(new CameraHandler());
        registerHandler(new DebugHandler());
        registerHandler(new GravityHandler());
        registerHandler(new JumpHandler());
        registerHandler(obstacleGenerator = new ObstacleGenerator());
        registerHandler(obstacleMover = new ObstacleMover());
        registerHandler(playerMovementHandler = new PlayerMovementHandler());
        registerHandler(new PlayerSpawner());
        registerHandler(new VelocityMovementHandler());
    }

    @Override
    public void update() {
        obstacleGenerator.update();
        obstacleMover.update();
        playerMovementHandler.update();
    }

    @Override
    public void resize(int width, int height) {
    }
}