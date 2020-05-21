package Game;

import Pieces.*;

public class Main {
    //Creating all array's to hold the piece objects(Pawn1 are the pawns for player 1 etc.)
    static Pawn[] pawn1 = new Pawn[8];
    static Pawn[] pawn2 = new Pawn[8];
    static Bishop[] bishop1 = new Bishop[2];
    static Bishop[] bishop2 = new Bishop[2];
    static Knight[] knight1 = new Knight[2];
    static Knight[] knight2 = new Knight[2];
    static King[] king1 = new King[1];
    static King[] king2 = new King[1];
    static Queen[] queen1 = new Queen[1];
    static Queen[] queen2 = new Queen[1];
    static Rook[] rook1 = new Rook[2];
    static Rook[] rook2 = new Rook[2];
////////////////////////////////////////////////////////////////////////////////////////////////////
    //Creating two player objects to assign pieces to a player
    static Player player1 = new Player(1, "white");
    static Player player2 = new Player(2, "black");
    //Creating all Piece objects and placing them on the board and assigning them to their player.
    static void boardSetup(){
///////////////////////Pawns/////////////////////////
        for(int i = 0; i<=7; i++){
            pawn1[i] = new Pawn(i+1,2,player1);
        }
        for(int i = 0; i<=7; i++){
            pawn2[i] = new Pawn(i+1,7,player2);
        }
///////////////////////Bishops/////////////////////////
        for(int i = 0; i<2; i++){
            int p = i == 0 ? 3 : 6;
            bishop1[i] = new Bishop(p,1,player1);
        }
        for(int i = 0; i<2; i++){
            int p = (i == 0 ? 3 : 6);
            bishop2[i] = new Bishop(p,8,player2);
        }
///////////////////////Knights/////////////////////////
        for(int i = 0; i <2; i ++){
            int p = (i == 0 ? 2 : 7);
            knight1[i] = new Knight(p,1, player1);
        }
        for(int i = 0; i <2; i ++){
            int p = (i == 0 ? 2 : 7);
            knight2[i] = new Knight(p,8,player2);
        }
///////////////////////Kings/////////////////////////
        king1[0] = new King(5,1,player1);
        king2[0] = new King(5,8,player2);
///////////////////////Queens/////////////////////////
        queen1[0] = new Queen(4,1,player1);
        queen2[0] = new Queen(4,8,player2);
///////////////////////Rooks/////////////////////////
        for(int i = 0; i <2; i ++){
            int p = (i == 0 ? 3 : 6);
            rook1[i] = new Rook(p,1,player1);
        }
        for(int i = 0; i <2; i ++){
            int p = (i == 0 ? 1 : 8);
            rook2[i] = new Rook(p,8,player2);
        }
    }
/////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        boardSetup();

    }
}