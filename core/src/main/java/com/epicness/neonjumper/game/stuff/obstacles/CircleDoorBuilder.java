package com.epicness.neonjumper.game.stuff.obstacles;

import com.epicness.neonjumper.game.stuff.pieces.ArcBuilder;
import com.epicness.neonjumper.game.stuff.pieces.ObstaclePiece;

public class CircleDoorBuilder extends ObstacleBuilder {

    private final int segments;
    private final float arcAngle, radius;

    public CircleDoorBuilder(int segments, float arcAngle, float radius) {
        this.segments = segments;
        this.arcAngle = arcAngle;
        this.radius = radius;
    }

    @Override
    ObstaclePiece[] makeObstacle() {
        ObstaclePiece[] pieces = new ObstaclePiece[segments];

        ArcBuilder arcBuilder = new ArcBuilder(arcAngle, radius, radius * 0.8f);

        for (int i = 0; i < segments; i++) {
            pieces[i] = new ObstaclePiece(arcBuilder);
            pieces[i].rotate(360f / segments * i);
        }
        return pieces;
    }
}