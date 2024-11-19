package com.epicness.neonjumper.game.logic.handlers;

import static com.badlogic.gdx.graphics.Color.RED;
import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.fundamentals.stuff.shapes.bidimensional.CirclePlus;
import com.epicness.fundamentals.utils.CollisionUtils;
import com.epicness.neonjumper.game.logic.GameLogicHandler;
import com.epicness.neonjumper.game.stuff.Obstacle;

public class CollisionHandler extends GameLogicHandler {

    private CirclePlus playerBounds;
    private SnapshotArray<Obstacle> obstacles;

    @Override
    protected void init() {
        playerBounds = stuff.getPlayer().getCircle();
        obstacles = stuff.getObstacles();
    }

    public void checkCollisions() {
        loopArray(obstacles, obstacle -> {
            if (CollisionUtils.overlapPolygonCircle(obstacle.getBounds(), playerBounds)) {
                obstacle.setBorderColor(RED);
            }
        });
    }
}