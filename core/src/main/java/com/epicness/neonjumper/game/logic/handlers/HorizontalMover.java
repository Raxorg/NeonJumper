package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.SharedScreen.gameWidth;
import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;

public class HorizontalMover extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;
    private float angle, x;

    @Override
    protected void init() {
        obstacles = new SnapshotArray<>();
    }

    protected void moveObstacles(float delta) {
        angle += delta * 90f;
        x = (MathUtils.sinDeg(angle) + 1f) / 2f * gameWidth();
        loopArray(obstacles, obstacle -> obstacle.setX(x));
    }

    public void registerObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    public void unregisterObstacle(Obstacle obstacle) {
        obstacles.removeValue(obstacle, true);
    }
}