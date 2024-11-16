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

    private SharedScreen(int cameraWidth, int cameraHeight) {
        dynamicCamera = new OrthographicCamera();
        dynamicCamera.setToOrtho(false, cameraWidth, cameraHeight);
        staticCamera = new OrthographicCamera();
        staticCamera.setToOrtho(false, cameraWidth, cameraHeight);
    }

    public SharedScreen() {
        this(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
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

    // Structure
    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    public void setRenderer(Renderer<?> renderer) {
        this.renderer = renderer;
    }
}