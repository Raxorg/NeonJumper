package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.SharedScreen.gameWidth;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.obstacles.CircleDoorBuilder;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;
import com.epicness.neonjumper.game.stuff.pieces.TriangleBuilder;

public class ObstacleGenerator extends GameLogicHandler {

    private SnapshotArray<Obstacle> obstacles;
    private CircleDoorBuilder circleDoorBuilder;
    private TriangleBuilder triangleBuilder;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
        circleDoorBuilder = new CircleDoorBuilder(3, 50f, 130f);
        triangleBuilder = new TriangleBuilder(100f);
    }

    public void spawnStartingObstacles() {
        for (int i = 0; i < 3; i++) {
            spawnObstacle(500f + i * 400f);
        }
    }

    private Obstacle spawnTriangle(TriangleBuilder triangleBuilder) {
        Obstacle triangle = new Obstacle(triangleBuilder);
        get(HorizontalMover.class).registerObstacle(triangle);
        return triangle;
    }

    private Obstacle spawnCircle(CircleDoorBuilder circleDoorBuilder) {
        return new Obstacle(circleDoorBuilder);
    }

    public void spawnObstacle(float y) {
        boolean random = MathUtils.randomBoolean();
        Obstacle obstacle = random ? spawnTriangle(triangleBuilder) : spawnCircle(circleDoorBuilder);
        obstacle.setPosition(gameWidth() / 2f, y);
        get(Rotator.class).registerObstacle(obstacle);
        obstacles.add(obstacle);
    }
}