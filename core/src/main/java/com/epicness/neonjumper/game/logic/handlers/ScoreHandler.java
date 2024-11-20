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
    private float progress;

    @Override
    protected void init() {
        scoreText = stuff.getScoreText();
        scoreText.setText("0");
        scoreText.setColor(WHITE_50);
        scoreText.setScale(5f);
        scoreText.setX(gameWidth() / 2f - scoreText.getPlainWidth() / 2f);
        scoreText.setY(gameHeight() - 20f);

        initialColor = new Color();
        auxColor = new Color();
        progress = 0f;
    }

    @Override
    protected void update(float delta) {
        if (progress == 1f) return;

        progress = Math.min(progress + delta, 1f);
        scoreText.setColor(auxColor.set(initialColor).lerp(WHITE_50, progress));
    }

    public void addScore(int score) {
        initialColor.set(GRASS);
        progress = 0f;
        int currentScore = Integer.parseInt(scoreText.getText());
        scoreText.setText(String.valueOf(currentScore + score));
    }

    public void removeScore(int score) {
        initialColor.set(SCARLET);
        progress = 0f;
        int currentScore = Integer.parseInt(scoreText.getText());
        scoreText.setText(String.valueOf(currentScore - score));
    }
}