package com.epicness.neonjumper.game.stuff;

import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.neonjumper.game.assets.GameAssets;

public class GameStuff extends Stuff<GameAssets> {

    private Player player;

    @Override
    public void initializeStuff() {
        player = new Player(assets.getCircle3Glow());
    }

    public Player getPlayer() {
        return player;
    }
}
