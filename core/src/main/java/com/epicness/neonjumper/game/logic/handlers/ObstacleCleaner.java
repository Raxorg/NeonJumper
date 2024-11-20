package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameHeight;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;

public class ObstacleCleaner extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;
    private Camera camera;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
        camera = screen.getDynamicCamera();
    }

    public void cleanObstacles() {
        float bottomY = camera.position.y - gameHeight() / 2f;
        loopArray(obstacles, obstacle -> {
            if (obstacle.getY() + obstacle.getHeight() < bottomY) {
                obstacles.removeValue(obstacle, true);
                get(Rotator.class).unregisterObstacle(obstacle);
            }
        });
    }
}