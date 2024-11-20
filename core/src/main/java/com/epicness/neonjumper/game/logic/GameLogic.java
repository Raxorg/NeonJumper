package com.epicness.neonjumper.game.logic;

import com.epicness.fundamentals.logic.Logic;
import com.epicness.neonjumper.game.logic.handlers.BottomChecker;
import com.epicness.neonjumper.game.logic.handlers.CameraHandler;
import com.epicness.neonjumper.game.logic.handlers.CollisionHandler;
import com.epicness.neonjumper.game.logic.handlers.DebugHandler;
import com.epicness.neonjumper.game.logic.handlers.GravityHandler;
import com.epicness.neonjumper.game.logic.handlers.InitSequenceHandler;
import com.epicness.neonjumper.game.logic.handlers.JumpHandler;
import com.epicness.neonjumper.game.logic.handlers.ObstacleCleaner;
import com.epicness.neonjumper.game.logic.handlers.ObstacleGenerator;
import com.epicness.neonjumper.game.logic.handlers.ObstacleMover;
import com.epicness.neonjumper.game.logic.handlers.GameLoopHandler;
import com.epicness.neonjumper.game.logic.handlers.PlayerSpawner;
import com.epicness.neonjumper.game.logic.handlers.Rotator;
import com.epicness.neonjumper.game.logic.handlers.ScoreHandler;
import com.epicness.neonjumper.game.logic.handlers.VelocityMovementHandler;

public class GameLogic extends Logic {

    private final GameLoopHandler gameLoopHandler;
    private final ObstacleGenerator obstacleGenerator;
    private final ObstacleMover obstacleMover;
    private final ScoreHandler scoreHandler;

    public GameLogic() {
        registerHandler(new BottomChecker());
        registerHandler(new CameraHandler());
        registerHandler(new CollisionHandler());
        registerHandler(new DebugHandler());
        registerHandler(gameLoopHandler = new GameLoopHandler());
        registerHandler(new GravityHandler());
        registerHandler(new JumpHandler());
        registerHandler(new ObstacleCleaner());
        registerHandler(obstacleGenerator = new ObstacleGenerator());
        registerHandler(obstacleMover = new ObstacleMover());
        registerHandler(new PlayerSpawner());
        registerHandler(new Rotator());
        registerHandler(new ScoreHandler());
        registerHandler(scoreHandler = new ScoreHandler());
        registerHandler(new VelocityMovementHandler());

        registerHandler(new InitSequenceHandler());
    }

    @Override
    public void update() {
        gameLoopHandler.update();
        obstacleGenerator.update();
        obstacleMover.update();
        scoreHandler.update();
    }

    @Override
    public void resize(int width, int height) {
    }
}