package com.epicness.neonjumper.game.logic.handlers;

import static com.badlogic.gdx.graphics.Color.SCARLET;
import static com.epicness.fundamentals.SharedScreen.gameHeight;
import static com.epicness.fundamentals.SharedScreen.gameWidth;
import static com.epicness.fundamentals.constants.ColorConstants.GRASS;
import static com.epicness.fundamentals.constants.ColorConstants.WHITE_50;

import com.badlogic.gdx.graphics.Color;
import com.epicness.fundamentals.stuff.Text;
import com.epicness.neonjumper.game.logic.GameLogicHandler;

public class ScoreHandler extends GameLogicHandler {

    private Text scoreText;
    private Color initialColor, auxColor;
    private float progress, lastY;
    private int score;
    private boolean penalizing;

    @Override
    protected void init() {
        scoreText = stuff.getScoreText();
        scoreText.setText("0");
        scoreText.setScale(5f);
        scoreText.setY(gameHeight() - 20f);
        scoreText.setWidth(gameWidth());
        scoreText.hAlignCenter();

        initialColor = new Color();
        auxColor = new Color();
        progress = 0f;
        lastY = 0f;
        score = 0;
        penalizing = false;
    }

    @Override
    protected void update(float delta) {
        if (progress == 1f) return;

        progress = Math.min(progress + delta, 1f);
        scoreText.setColor(auxColor.set(initialColor).lerp(WHITE_50, progress));

        if (progress == 1f) penalizing = false;
    }

    public void updateScore(float playerY) {
        if (lastY < playerY) {
            if (!penalizing) {
                initialColor.set(GRASS);
                progress = 0f;
            }
            score += playerY - lastY;
            scoreText.setText(String.valueOf(score));
            lastY = playerY;
        }
    }

    public void penalize() {
        initialColor.set(SCARLET);
        progress = 0f;
        score -= Math.min(1000, score);
        penalizing = true;
        scoreText.setText(String.valueOf(score));
    }
}