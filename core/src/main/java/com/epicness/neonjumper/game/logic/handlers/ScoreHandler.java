package com.epicness.neonjumper.game.logic.handlers;

import com.epicness.fundamentals.stuff.Text;
import com.epicness.neonjumper.game.logic.GameLogicHandler;

public class ScoreHandler extends GameLogicHandler {

    private Text scoreText;

    @Override
    protected void init() {
        scoreText = stuff.getScoreText();
    }
}