package com.epicness.neonjumper.game.logic.handlers;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.fundamentals.stuff.shapes.bidimensional.CirclePlus;
import com.epicness.fundamentals.utils.CollisionUtils;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;

public class CollisionHandler extends GameLogicHandler {

    private CirclePlus playerBounds;
    private SnapshotArray<Obstacle> obstacles;

    @Override
    protected void init() {
        playerBounds = stuff.getPlayer().getCircle();
        obstacles = stuff.getObstacles();
    }

    public void checkCollisions() {
        loopArray(obstacles, obstacle -> loopArray(obstacle.getPieces(), piece -> {
            if (CollisionUtils.overlapPolygonCircle(piece.getBounds(), playerBounds)) {
                obstacles.removeValue(obstacle, true);
                sharedAssets.getShortLaser().play();
                get(ScoreHandler.class).penalize();
            }
        }));
    }
}