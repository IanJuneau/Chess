package Pieces;
import Game.*;

import static java.lang.StrictMath.abs;

public class Pawn extends Piece {
    Type type;
    int xpos, ypos;
    Board board = new Board();

    public Pawn(int x, int y) {
        super(x, y);
        this.xpos = x;
        this.ypos = y;
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

        for(int i = 0; i < Main.player1.length;i++){
            if(Main.player1[i].getX() == finalX && Main.player1[i].getY() == finalY){
                System.out.println("That space is occupied");
                return;
            }
            if(Main.player2[i].getX() == finalX && Main.player2[i].getY() == finalY){
                System.out.println("That space is occupied");
                return;
            }
            if(i == Main.player1.length) {
                System.out.println("This tile is open");
                break;
            }
        }

        if(finalX > 7 || finalX < 0 || finalY > 7 || finalY < 0){
            System.out.println("You cannot move a piece off of the board");
            return;
        }
        
        //Calculates the difference in coordinates
        int dx = finalX - iniX, dy = finalY - iniY;

        if (isMovPoss(dx, dy)) {
            setPos(finalX, finalY);
        } else {
            System.out.println("That is an illegal move for a " + type);
        }
    }
}