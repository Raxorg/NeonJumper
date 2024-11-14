package com.epicness.neonjumper;

import com.badlogic.gdx.Game;
import com.epicness.fundamentals.SharedResources;
import com.epicness.neonjumper.game.GameInitializer;
import com.epicness.neonjumper.game.assets.GameAssets;

public class NeonJumperGame extends Game {

    @Override
    public void create() {
        GameAssets assets = new GameAssets();
        assets.queueAssetLoading();
        assets.finishLoading();
        assets.initializeAssets();

        new GameInitializer(assets).initialize(new SharedResources());
    }
}
