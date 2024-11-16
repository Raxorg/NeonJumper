package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Obstacle;

public class ObstacleMover extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;
    private float obstacleSpeed;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
        obstacleSpeed = -100f;
    }

    @Override
    protected void update(float delta) {
        //loopArray(obstacles, obstacle -> obstacle.translateY(obstacleSpeed * delta));
    }
}