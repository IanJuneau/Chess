package Pieces;
import Game.*;

import static java.lang.StrictMath.abs;

public class Bishop extends Piece {

    Type type;

    int xpos, ypos;

    public Bishop(int x, int y){
        super(x,y);
        this.xpos = x;
        this.ypos = y;
        setPos(xpos, ypos);
        type = type.BISHOP;
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
        if(abs(deltaX) == abs(deltaY)){
            return true;
        }else {
            return false;
        }
    }

    public void move(int iniX, int iniY, int finalX, int finalY){
        if(finalX > 8 || finalX < 0 || finalY > 8 || finalY < 0){
            System.out.println("You cannot move a piece off of the board");
            return;
        }

        //Calculates the difference in coordinates
        int deltaX = finalX - iniX, deltaY = finalY-iniY;

        if(isMovPoss(deltaX, deltaY)){
            setPos(finalX, finalY);
        }else{
            System.out.println("That is an illegal move for a " + type);
        }
    }
}