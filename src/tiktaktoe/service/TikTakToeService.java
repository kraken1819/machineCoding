package tiktaktoe.service;

import java.util.Scanner ;

import tiktaktoe.model.Player ;
import tiktaktoe.model.Board ;


public class TikTakToeService {

    private Board board ;
    private Player player1 ;
    private Player player2 ;

    public TikTakToeService(Board board , Player player1 , Player player2) {
        this.board = board ;
        this.player1 = player1 ;
        this.player2 = player2 ;
    }
    public boolean somOneWon(char[][] board){
        //here we check if anOne won the game .
        //check the rows ;
        for(int i =0 ; i<3 ; i++) {
            boolean won = true ;
            for(int j=0 ; j<2 ; j++) {
                if(!(board[i][j]!='-' && board[i][j] == board[i][j+1])) {
                    won = false ;
                    break ;
                }
            }
            if(won) return true ;
        }

        //check the columns ;
        for(int i =0 ; i<3 ; i++) {
            boolean won = true ;
            for(int j=0 ; j<2 ; j++) {
                if(!(board[j][i] != '-' && board[j][i] == board[j+1][i])) {
                    won = false ;
                    break ;
                }
            }
            if(won) return true ;
        }

        //check the diagonals ;
        boolean won = true ;
        for(int i =0 ; i<2 ; i++) {
            if(!(board[i][i]!='-' && board[i][i] == board[i+1][i+1])) {
                won = false ;
                break ;
            }
        }
        if(won) return true ;

        won = true ;
        for(int i =0 ; i<2 ; i++) {
            if(!(board[i][2-i]!='-' && board[i][2-i] == board[i+1][2-i-1])) {
                won = false ;
                break ;
            }
        }

        return won ;

    }
    public void startGame(){

        Scanner scx = new Scanner(System.in) ;
        int i =0 ;
        board.printBoard();
        while(!(somOneWon(board.getBoard())) && scx.hasNextInt()){
            System.out.println() ;
            int row = scx.nextInt() ;
            int col = scx.nextInt() ;
            Player currentPlayer ;
            if(i%2==0) {
                currentPlayer = player1 ;
            }else {
                currentPlayer = player2 ;
            }
            while(!board.setBoard(row,col,currentPlayer.getSymbol())){
                System.out.println("Invalid Input") ;
                row = scx.nextInt() ;
                col = scx.nextInt() ;
            }
            board.printBoard() ;
            i++ ;
        }

        if(somOneWon(board.getBoard())){
            Player winner ;
            if(i%2==0){
                winner = player2 ;
            }else {
                winner = player1;
            }
            System.out.println(winner.getName() + " won the game.") ;
        }else {

            int numOfMovesDone = i;
            if (numOfMovesDone == 9) System.out.println("GameOver");
        }
        scx.close() ; 
    }
}
