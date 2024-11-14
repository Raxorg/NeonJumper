package com.epicness.neonjumper.game;

import static com.badlogic.gdx.graphics.Color.BLACK;
import static com.epicness.neonjumper.game.logic.handlers.DebugHandler.debug;

import com.badlogic.gdx.utils.ScreenUtils;
import com.epicness.fundamentals.renderer.Renderer;
import com.epicness.neonjumper.game.stuff.GameStuff;

public class GameRenderer extends Renderer<GameStuff> {

    @Override
    public void render() {
        ScreenUtils.clear(BLACK);

        spriteBatch.begin();
        stuff.getPlayer().draw(shapeDrawer, spriteBatch);
        spriteBatch.end();

        if (debug) {
            renderDebug();
        }
    }

    private void renderDebug() {
        spriteBatch.begin();
        stuff.getPlayer().drawDebug(shapeDrawer);
        spriteBatch.end();
    }
}