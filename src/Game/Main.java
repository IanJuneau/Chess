package Game;

import Pieces.*;

public class Main {
    //Creating all array's to hold the piece objects(Pawn1 are the pawns for player 1 etc.)
    static public Piece player1[] = new Piece[16];
    static public Piece player2[] = new Piece[16];
    /*
        Indecies 0-7 are pawns(from left to right)
        8-9 are rooks
        10-11 are knights
        12-13 are bishops
        14 is the queen
        15 is the king
     */
    //Creating a board object to access the board
    static Board board = new Board();
    //Creating all Piece objects and placing them on the board
    static void boardSetup(){
        for (int i = 0; i<player1.length; i++){
            //Pawns
            if(i<=7){
                player1[i] = new Pawn(i,1);
                player2[i] = new Pawn(i,6);
                board.isOccupied[i][1] = true;
                board.isOccupied[i][6] = true;
            }
            //Rooks
            if(i>7 && i < 10){
                int p = ((i == 8 ? 0 : 7));
                player1[i] = new Rook(p,0);
                player2[i] = new Rook(p,7);
                board.isOccupied[p][0] = true;
                board.isOccupied[p][7] = true;
            }
            //Knights
            if(i>9 && i < 12){
                int p = ((i == 10 ? 1 : 6));
                player1[i] = new Knight(p,0);
                player2[i] = new Knight(p,7);
                board.isOccupied[p][0] = true;
                board.isOccupied[p][7] = true;
            }
            //Bishops
            if(i>11 && i<14){
                int p = ((i == 10 ? 1 : 6));
                player1[i] = new Bishop(p,0);
                player2[i] = new Bishop(p,7);
                board.isOccupied[p][0] = true;
                board.isOccupied[p][7] = true;
            }
            //Queens
            if(i==14){
                player1[i] = new Queen(3,0);
                player2[i] = new Queen(3,7);
                board.isOccupied[3][0] = true;
                board.isOccupied[3][7] = true;
            }
            //Kings
            if(i==15){
                player1[i] = new King(4,0);
                player2[i] = new King(4,7);
                board.isOccupied[4][0] = true;
                board.isOccupied[4][7] = true;
            }
        }
    }
/////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args) {
        boardSetup();

        player1[2].move(player1[2].getX(),player1[2].getY(),2,9);

    }
}