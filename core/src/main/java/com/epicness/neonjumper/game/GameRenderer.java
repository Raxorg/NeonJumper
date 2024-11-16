package com.epicness.neonjumper.game;

import static com.badlogic.gdx.graphics.Color.BLACK;
import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;
import static com.epicness.neonjumper.game.logic.handlers.DebugHandler.debug;

import com.badlogic.gdx.utils.ScreenUtils;
import com.epicness.fundamentals.renderer.Renderer;
import com.epicness.neonjumper.game.stuff.GameStuff;

public class GameRenderer extends Renderer<GameStuff> {

    @Override
    public void render() {
        ScreenUtils.clear(BLACK);

        useDynamicCamera();
        spriteBatch.begin();
        stuff.getPlayer().draw(shapeDrawer, spriteBatch);
        loopArray(stuff.getObstacles(), obstacle -> obstacle.draw(shapeDrawer));
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