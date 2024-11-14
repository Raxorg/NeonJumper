package com.epicness.neonjumper.game;

import static com.badlogic.gdx.graphics.Color.BLACK;
import static com.epicness.neonjumper.game.constants.GameConstants.MIN_VIEWPORT_HEIGHT;
import static com.epicness.neonjumper.game.constants.GameConstants.MIN_VIEWPORT_WIDTH;
import static com.epicness.neonjumper.game.logic.handlers.DebugHandler.debug;

import com.badlogic.gdx.utils.ScreenUtils;
import com.epicness.fundamentals.renderer.Renderer;
import com.epicness.neonjumper.game.stuff.GameStuff;

public class GameRenderer extends Renderer<GameStuff> {

    public GameRenderer() {
        viewport.setMinWorldHeight(MIN_VIEWPORT_HEIGHT);
        viewport.setMinWorldWidth(MIN_VIEWPORT_WIDTH);
    }

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