package Pieces;
import Game.*;

import static java.lang.StrictMath.abs;

public class Rook extends Piece {

    Type type;

    int xpos, ypos;

    public Rook(int x, int y){
        super(x,y);
        this.xpos = x;
        this.ypos = y;
        setPos(xpos, ypos);
        type = type.ROOK;
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
        if((deltaX == 0 && abs(deltaY) <=8) || deltaY == 0 && abs(deltaX) <= 8){ //If you are only moving in one coordinate
            return true; //The Rook can move
        }else{
            return false; //The Rook cannot move
        }
    }

    public void move(int iniX, int iniY, int finalX, int finalY) {
        if(finalX > 8 || finalX < 0 || finalY > 8 || finalY < 0){
            System.out.println("You cannot move a piece off of the board");
            return;
        }

        //Calculates the difference in coordinates
        int deltaX = finalX - iniX, deltaY = finalY - iniY;

        if (isMovPoss(deltaX, deltaY)) {
            setPos(finalX, finalY);
        } else {
            System.out.println("That is an illegal move for a " + type);
        }
    }

}