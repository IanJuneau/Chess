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

    public void setPos(int x, int y) {
        this.xpos = x;
        this.ypos = y;
    }

    public boolean isMovPoss(int deltaX, int deltaY) {

        /////////Known Issue///////////////
        /*
            The pawn can move two tiles at a time on the opponents starting row
            Pawns can move backwards
         */
        if(this.ypos == 2 || this.ypos == 7){ //If the Pawn is in the starting row
            if(abs(deltaY) <=2 && deltaX == 0){ //If you're trying to move forward one or two tiles, and not moving sideways
                return true; //The pawn can move
            }else{
                return false; //The pawn cannot move
            }
        }else{ //If the pawn is not in the starting row
            if(abs(deltaY) <= 1 && deltaX == 0){ //If you're trying to move forward only one tile, and not moving sideways
                return true; //The pawn can move
            }else{
                return false; //The pawn cannot move
            }
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
