package com.epicness.neonjumper.game;

import com.epicness.fundamentals.initializer.Initializer;
import com.epicness.neonjumper.game.assets.GameAssets;
import com.epicness.neonjumper.game.logic.GameLogic;
import com.epicness.neonjumper.game.stuff.GameStuff;

public class GameInitializer extends Initializer<GameAssets, GameLogic, GameRenderer, GameStuff> {

    public GameInitializer(GameAssets assets) {
        super(assets, new GameLogic(), new GameRenderer(), new GameStuff());
    }
}
