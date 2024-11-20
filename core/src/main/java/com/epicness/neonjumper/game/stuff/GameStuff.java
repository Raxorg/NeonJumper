package com.epicness.neonjumper.game.stuff;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.fundamentals.stuff.Text;
import com.epicness.neonjumper.game.assets.GameAssets;
import com.epicness.neonjumper.game.stuff.obstacles.Obstacle;

public class GameStuff extends Stuff<GameAssets> {

    private Player player;
    private SnapshotArray<Obstacle> obstacles;
    private Text scoreText;

    @Override
    public void initializeStuff() {
        player = new Player(assets.getCircle3Glow());
        obstacles = new SnapshotArray<>();
        scoreText = new Text(sharedAssets.getPixelFont());
    }

    public Player getPlayer() {
        return player;
    }

    public SnapshotArray<Obstacle> getObstacles() {
        return obstacles;
    }

    public Text getScoreText() {
        return scoreText;
    }
}