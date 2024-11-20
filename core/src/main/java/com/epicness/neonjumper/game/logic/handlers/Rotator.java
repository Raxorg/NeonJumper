package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;

public class Rotator extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;

    @Override
    protected void init() {
        obstacles = new SnapshotArray<>();
    }

    public void rotateObstacles(float delta) {
        loopArray(obstacles, obstacle -> obstacle.rotate(90f * delta));
    }

    public void registerObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    public void unregisterObstacle(Obstacle obstacle) {
        obstacles.removeValue(obstacle, true);
    }
}