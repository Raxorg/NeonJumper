package com.epicness.fundamentals;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.epicness.fundamentals.logic.Logic;
import com.epicness.fundamentals.renderer.Renderer;

public class SharedScreen extends ScreenAdapter {

    // Structure
    private Logic logic;
    private Renderer<?> renderer;
    // Screen related
    private final OrthographicCamera dynamicCamera, staticCamera;
    private static float gameWidth, gameHeight;

    public SharedScreen() {
        dynamicCamera = new OrthographicCamera();
        staticCamera = new OrthographicCamera();
        setCameraHeight(1000f);
    }

    @Override
    public void render(float delta) {
        logic.update();
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        // TODO: 11/15/2024 let the cameras know about this
        // Initial idea is to change the zoom and probably move the camera when user resizes the window
        logic.resize(width, height);
    }

    @Override
    public void pause() {
        logic.pause();
    }

    public OrthographicCamera getDynamicCamera() {
        return dynamicCamera;
    }

    public OrthographicCamera getStaticCamera() {
        return staticCamera;
    }

    public void setCameraWidth(float width) {
        float ratio = (float) Gdx.graphics.getHeight() / Gdx.graphics.getWidth();
        gameWidth = width;
        gameHeight = width * ratio;
        dynamicCamera.setToOrtho(false, gameWidth, gameHeight);
        staticCamera.setToOrtho(false, gameWidth, gameHeight);
    }

    public void setCameraHeight(float height) {
        float ratio = (float) Gdx.graphics.getWidth() / Gdx.graphics.getHeight();
        gameHeight = height;
        gameWidth = height * ratio;
        dynamicCamera.setToOrtho(false, gameWidth, gameHeight);
        staticCamera.setToOrtho(false, gameWidth, gameHeight);
    }

    public static float gameWidth() {
        return gameWidth;
    }

    public static float gameHeight() {
        return gameHeight;
    }

    // Structure
    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    public void setRenderer(Renderer<?> renderer) {
        this.renderer = renderer;
    }
}