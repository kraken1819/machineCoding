

import models.Board ; 
import service.TwozerofoureightService; 
public class Main { 

    public static void main(String[] args){

        //intialise the board ; 

        Board board = new Board() ; 

        board.printBoard() ; 

        //initialize the service 

        TwozerofoureightService a2048service = new TwozerofoureightService(board) ; 

        a2048service.startGame();


    }
}