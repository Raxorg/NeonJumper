package com.epicness.neonjumper.game.stuff.obstacles;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.interfaces.Movable;
import com.epicness.fundamentals.stuff.interfaces.ShapeDrawable;
import com.epicness.neonjumper.game.stuff.pieces.ObstaclePiece;
import com.epicness.neonjumper.game.stuff.pieces.PieceBuilder;

public class Obstacle implements ShapeDrawable, Movable {

    protected final ObstaclePiece[] pieces;

    public Obstacle(ObstacleBuilder obstacleBuilder) {
        pieces = obstacleBuilder.makeObstacle();
    }

    public Obstacle(PieceBuilder pieceBuilder) {
        pieces = new ObstaclePiece[]{new ObstaclePiece(pieceBuilder)};
    }

    @Override
    public final void draw(ShapeDrawerPlus shapeDrawer) {
        loopArray(pieces, piece -> piece.draw(shapeDrawer));
    }

    @Override
    public final float getX() {
        return pieces[0].getX();
    }

    @Override
    public final void translateX(float amount) {
        loopArray(pieces, piece -> piece.translateX(amount));
    }

    @Override
    public final float getY() {
        return pieces[0].getY();
    }

    @Override
    public final void translateY(float amount) {
        loopArray(pieces, piece -> piece.translateY(amount));
    }

    public final float getHeight() {
        float height = 0f;
        for (int i = 0; i < pieces.length; i++) {
            height = Math.max(height, pieces[i].getHeight());
        }
        return height;
    }

    public ObstaclePiece[] getPieces() {
        return pieces;
    }
}