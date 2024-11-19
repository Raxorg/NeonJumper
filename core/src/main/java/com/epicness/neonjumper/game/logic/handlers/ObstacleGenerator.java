package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;
import static com.epicness.neonjumper.game.constants.GameConstants.ARC_90_VERTS;
import static com.epicness.neonjumper.game.constants.GameConstants.TRIANGLE_VERTS;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Obstacle;

public class ObstacleGenerator extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();

        for (int i = 0; i < 20; i++) {
            Obstacle triangleObstacle = new Obstacle(ARC_90_VERTS);
            triangleObstacle.setPosition(MathUtils.random(0f, 300f), MathUtils.random(0f, 700f));
            obstacles.add(triangleObstacle);
        }
    }

    @Override
    protected void update(float delta) {
        loopArray(obstacles, obstacle -> {

        });
    }
}