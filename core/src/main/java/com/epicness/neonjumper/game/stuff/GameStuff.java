package com.epicness.neonjumper.game.stuff;

import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameHeight;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameWidth;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.neonjumper.game.assets.GameAssets;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;

public class GameStuff extends Stuff<GameAssets> {

    private Player player;
    private SnapshotArray<Obstacle> obstacles;

    private Sprite bufferSprite;

    @Override
    public void initializeStuff() {
        player = new Player(assets.getCircle3Glow());
        obstacles = new SnapshotArray<>();

        bufferSprite = new Sprite();
        bufferSprite.setSize(gameWidth(), gameHeight());
    }

    public Player getPlayer() {
        return player;
    }

    public SnapshotArray<Obstacle> getObstacles() {
        return obstacles;
    }

    public Sprite getBufferSprite() {
        return bufferSprite;
    }
}