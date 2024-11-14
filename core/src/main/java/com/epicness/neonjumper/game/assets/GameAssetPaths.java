package com.epicness.neonjumper.game.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.util.ArrayList;
import java.util.List;

public class GameAssetPaths {
    static final List<AssetDescriptor<?>> ASSETS;

    public static final AssetDescriptor<Sprite> CIRCLE3_SPRITE;

    public static final AssetDescriptor<Sprite> CIRCLE3GLOW_SPRITE;

    static {
        ASSETS = new ArrayList<>();
        ASSETS.add(CIRCLE3_SPRITE = new AssetDescriptor<>("neonjumper/game/images/circle3.png", Sprite.class));
        ASSETS.add(CIRCLE3GLOW_SPRITE = new AssetDescriptor<>("neonjumper/game/images/circle3Glow.png", Sprite.class));
    }
}