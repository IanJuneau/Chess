package Game;

public abstract class Piece {

    int x, y; //Variables to describe the location of a piece. X is the row y is the column.
    Player player; // Figuring out who the piece belongs to.


    /*
        A constructor for each piece
        @param x = x location of the piece
        @param y = y location of the piece
        @param player = player who controls the piece
     */


    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract int getX();

    public abstract int getY();

    public abstract void setPos(int x, int y);

    public abstract void move(int iniX, int iniY, int finalX, int finalY);

    public abstract boolean isMovPoss(int deltaX, int deltaY);


    /*
        The function used to move pieces around
        @param iniX = the X position before moving
        @param iniY = the Y position before moving
        @param finalX = the X position after moving
        @param finalY = The Y position after moving
     */



}
