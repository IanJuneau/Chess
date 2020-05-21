package Pieces;
import Game.*;

public class Queen extends Piece {

    Type type;

    public Queen(int x, int y, Player player){
        super(x,y,player);
        type = type.QUEEN;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setPos(int x, int y) {

    }

    public void move(int iniX, int iniY, int finalX, int finalY) {

    }

    public boolean isMovPoss(int deltaX, int deltaY) {
        return false;
    }

    public boolean isMovPoss() {
        return false;
    }

}