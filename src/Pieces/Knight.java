package Pieces;
import Game.*;

import static java.lang.StrictMath.abs;

public class Knight extends Piece {

    Type type;

    int xpos, ypos;

    public Knight(int x, int y){
        super(x,y);
        this.xpos = x;
        this.ypos = y;
        setPos(xpos, ypos);
        type = type.KNIGHT;
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
        if((abs(deltaX) == 2 && abs(deltaY) == 1) || abs(deltaX) == 1 && abs(deltaY) == 2){
            return true; //The Knight can move
        }else {
            return false;
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