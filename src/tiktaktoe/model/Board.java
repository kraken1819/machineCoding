package tiktaktoe.model;
import java.util.Arrays ;
public class Board {
    private final char[][] board ;

    public Board(){
        this.board = new char[3][3] ;
        for(int i =0 ; i<3 ; i++) {
            Arrays.fill(board[i], '-');
        }
    }

    public char[][] getBoard(){
        return this.board ;
    }

    public boolean setBoard(int row , int column , char symbol){
        if(board[row-1][column-1] == '-'){
            board[row-1][column-1] = symbol ;
            return true ;
        }else {
            return false;
        }
    }
    public void printBoard(){
        for(int i =0 ; i<3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println() ;
    }
}
