package com.epicness.neonjumper.game.assets;

import static com.epicness.neonjumper.game.assets.GameAssetPaths.*;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.epicness.fundamentals.assets.Assets;

public class GameAssets extends Assets {
    private Sprite circle3;

    private Sprite circle3Glow;

    public GameAssets() {
        super(ASSETS);
    }

    @Override
    public void initializeAssets() {
        circle3 = get(CIRCLE3_SPRITE);
        circle3Glow = get(CIRCLE3GLOW_SPRITE);
    }

    public Sprite getCircle3() {
        return circle3;
    }

    public Sprite getCircle3Glow() {
        return circle3Glow;
    }
}