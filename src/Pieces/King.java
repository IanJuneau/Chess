package Pieces;
import Game.*;

public class King extends Piece {

    Type type;

    public King(int x, int y, Player player){
        super(x,y,player);
        type = type.KING;
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