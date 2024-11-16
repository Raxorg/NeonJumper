package com.epicness.neonjumper.game.stuff;

import static com.badlogic.gdx.graphics.Color.CLEAR;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameHeight;
import static com.epicness.neonjumper.game.logic.handlers.CameraHandler.gameWidth;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.neonjumper.game.assets.GameAssets;

public class GameStuff extends Stuff<GameAssets> {

    private Sprited background;
    private Player player;
    private SnapshotArray<Obstacle> obstacles;

    private Sprite bufferSprite;

    @Override
    public void initializeStuff() {
        background = new Sprited(sharedAssets.getPixel());
        background.setSize(1000f, 1000f);
        background.setColor(CLEAR);

        player = new Player(assets.getCircle3Glow());
        obstacles = new SnapshotArray<>();

        bufferSprite = new Sprite();
        bufferSprite.setSize(gameWidth(), gameHeight());
    }

    public Sprited getBackground() {
        return background;
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
