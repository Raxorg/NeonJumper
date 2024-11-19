package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Obstacle;

public class ObstacleGenerator extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
        float[] verts = {
            0f, 0f,
            100f, 0f,
            50f, 100f,
        };
        for (int i = 0; i < 20; i++) {
            Obstacle obstacle = new Obstacle(verts);
            obstacle.setPosition(MathUtils.random(0f, 300f), MathUtils.random(0f, 700f));
            obstacles.add(obstacle);
        }
    }

    @Override
    protected void update(float delta) {
        loopArray(obstacles, obstacle -> {

        });
    }
}