package models;

import java.util.ArrayList ; 
import java.util.Random; 

public class Board {
    private int[][] board ; 


    public Board(){
        this.board = new int[4][4] ; 

         
        addRandom() ; 
        addRandom() ; 
    }

    public int[][] getBoard(){
        return board ; 
    }

    public void setBoard(int i , int j , int ele){
        board[i][j] = ele ; 
    }

    public void addRandom(){
        int[] index = randomIndex() ; 
        board[index[0]][index[1]] = 2 ;  
    }

    public void printBoard(){
        System.out.println() ; 
        for(int[] row : board){
            for( int ele : row){
                if(ele==0){
                    System.out.print("- ") ; 
                }else{
                    System.out.print(ele + " ") ;
                } 
            }
            System.out.println() ; 
        }
        System.out.println("_______") ; 
    }

    public int[] randomIndex() { 

        ArrayList<Integer> row = new ArrayList<>() ; 
        ArrayList<Integer> col = new ArrayList<>() ; 
        //System.out.println("board length is : "+ board.length) ; 
        for(int i =0 ; i<board.length ; i++){
            for(int j =0 ; j<board.length ; j++){
                if(board[i][j] == 0){
                    row.add(i) ; 
                    col.add(j) ;
                } 
            }
        }
        Random random = new Random() ;

        //System.out.println(row.size()) ; 
        int rand = random.nextInt(row.size()) ; 
       
        return new int[]{row.get(rand) , col.get(rand) } ; 
    }
}
