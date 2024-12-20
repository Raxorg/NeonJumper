package com.epicness.neonjumper.game.logic.handlers;

import com.epicness.neonjumper.game.logic.GameLogicHandler;

public class GameLoopHandler extends GameLogicHandler {

    @Override
    protected void init() {
    }

    @Override
    protected void update(float delta) {
        get(GravityHandler.class).applyGravity(delta);
        get(VelocityMovementHandler.class).movePlayer(delta);
        get(BottomChecker.class).checkBottom();
        get(CameraHandler.class).followPlayer();
        get(Rotator.class).rotateObstacles(delta);
        get(HorizontalMover.class).moveObstacles(delta);
        get(CollisionHandler.class).checkCollisions();
        get(ObstacleCleaner.class).cleanObstacles();
    }
}