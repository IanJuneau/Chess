package Pieces;
import Game.*;

import static java.lang.StrictMath.abs;

public class Queen extends Piece {

    Type type;

    int xpos, ypos;

    public Queen(int x, int y, Player player) {
        super(x, y, player);
        type = type.QUEEN;
    }

    public int getX() {
        return this.xpos;
    }

    public int getY() {
        return this.ypos;
    }

    public void setPos(int x, int y) {
        this.xpos = x;
        this.ypos = y;
    }

    public boolean isMovPoss(int deltaX, int deltaY) {
        /////////////For a diagonal move///////////////////
        if(abs(deltaX) == abs(deltaY)){
            if(abs(deltaX) <= 8 && abs(deltaY) <= 8){ //If it is trying to move onto a tile on the board(this check doesn't actually work)
                return true; //The Queen can move
            }else{ //If the Queen is trying to move off of the board
                return false; //The Queen cannot move
            }
        }
        /////////////For a straight line move///////////////
        if((deltaX == 0 && abs(deltaY) <=8) || deltaY == 0 && abs(deltaX) <= 8){ //If you are only moving in one coordinate
            return true; //The Queen can move
        }
        /////////////Any case not handled//////////////////
        return false; //The Queen cannot move
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