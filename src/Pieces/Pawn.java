package Pieces;
import Game.*;

import static java.lang.StrictMath.abs;

public class Pawn extends Piece {
    Type type;
    int xpos, ypos;

    public Pawn(int x, int y, Player player) {
        super(x, y, player);
        setPos(xpos, ypos);

        type = Type.PAWN;
    }

    public int getX() {
        return this.xpos;
    }

    public int getY() {
        return this.ypos;
    }

    @Override
    public void setPos(int x, int y) {

    }

    public boolean isMovPoss(int deltaX, int deltaY) {
        if (abs(deltaX) == abs(deltaY)) {
            return true;
        } else {
            return false;
        }
    }

    public void move(int iniX, int iniY, int finalX, int finalY) {
        //Calculates the difference in coordinates
        int deltaX = finalX - iniX, deltaY = finalY - iniY;

        if (isMovPoss(deltaX, deltaY)) {
            setPos(finalX, finalY);
        } else {
            System.out.println("That is an illegal move for a " + type);
        }
    }
}
