package com.epicness.fundamentals.constants;

import com.badlogic.gdx.math.Vector2;

public class SharedConstants {

    // Directions
    public static final Vector2[] COMPASS_DIRECTIONS = {
        new Vector2(1f, 0f),    // East
        new Vector2(1f, 1f),    // North East
        new Vector2(0f, 1f),    // North
        new Vector2(-1f, 1f),   // North West
        new Vector2(-1f, 0f),   // West
        new Vector2(-1f, -1f),  // South West
        new Vector2(0f, -1f),   // South
        new Vector2(1f, -1f)    // South East
    };

    public static final Vector2[] CARDINAL_DIRECTIONS = {
        new Vector2(1f, 0f),    // East
        new Vector2(0f, 1f),    // North
        new Vector2(-1f, 0f),   // West
        new Vector2(0f, -1f)    // South
    };

    public static final Vector2[] DIAGONAL_DIRECTIONS = {
        new Vector2(1f, 1f),    // North East
        new Vector2(-1f, 1f),   // North West
        new Vector2(-1f, -1f),  // South West
        new Vector2(1f, -1f)    // South East
    };
}