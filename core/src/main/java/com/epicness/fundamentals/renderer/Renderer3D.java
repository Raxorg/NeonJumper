package com.epicness.fundamentals.renderer;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.epicness.fundamentals.stuff.Stuff;

public abstract class Renderer3D<S extends Stuff<?>> extends Renderer<S> {

    // Structure
    protected final PerspectiveCamera perspectiveCamera;
    protected final ModelBatch modelBatch;

    public Renderer3D() {
        perspectiveCamera = new PerspectiveCamera(90f, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        perspectiveCamera.far = 1000f;

        modelBatch = new ModelBatch();
    }

    public PerspectiveCamera getPerspectiveCamera() {
        return perspectiveCamera;
    }

    protected void clearDepth(Color color) {
        ScreenUtils.clear(color, true);
    }
}