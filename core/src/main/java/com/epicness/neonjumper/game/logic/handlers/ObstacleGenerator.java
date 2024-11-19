package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameWidth;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.obstacles.CircleDoorBuilder;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;
import com.epicness.neonjumper.game.stuff.pieces.TriangleBuilder;

public class ObstacleGenerator extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();

        CircleDoorBuilder circleDoorBuilder = new CircleDoorBuilder(3, 60f, 100f);
        TriangleBuilder triangleBuilder = new TriangleBuilder(100f);
        for (int i = 0; i < 5; i++) {
            Obstacle obstacle = MathUtils.randomBoolean() ? new Obstacle(circleDoorBuilder) : new Obstacle(triangleBuilder);
            obstacle.setPosition(gameWidth() / 2f, 500f + i * 400f);
            obstacles.add(obstacle);
        }
    }

    @Override
    protected void update(float delta) {
        loopArray(obstacles, obstacle -> {

        });
    }
}