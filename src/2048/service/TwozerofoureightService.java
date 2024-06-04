package service;

import java.util.Scanner ; 

import models.Board; 

public class TwozerofoureightService {

    private Board board ; 

    public TwozerofoureightService(Board board){
        this.board = board ; 
    }

    

    public void startGame(){


        Scanner scx = new Scanner(System.in) ; 

        while(true) {
            System.out.print("Enter the move: ") ; 


            //if there are no moves left 
            
            int move = scx.nextInt() ; 

            if(move == -1) break ; 

            //if the move is 0 . we have to move left ;  
            if(move == 0){  
                for(int row = 0 ; row<4 ; row++){
                    int j = 0 ; 
                    for(int i=0 ; i<4 ; i++){
                        if(board.getBoard()[row][i] != 0){
                            int temp = board.getBoard()[row][i] ;  
                            board.setBoard(row,i,0) ; 
                            board.setBoard(row,j++,temp) ;
                        }
                    }
                }
                

                //now we make the operations . 
                for(int row = 0 ; row<4 ; row++){
                    for(int i = 3 ; i>0 ; i--){
                        if(board.getBoard()[row][i]==0) continue ; 

                        if(board.getBoard()[row][i] == board.getBoard()[row][i-1]){
                            board.setBoard(row,i-1, 2*board.getBoard()[row][i] );
                            board.setBoard(row,i,0) ; 
                            i-- ; //to prevent multiple combing for same element 
                        }
                    }
                }
                //again move them to the left 
                for(int row = 0 ; row<4 ; row++){
                    int j = 0 ; 
                    for(int i=0 ; i<4 ; i++){
                        if(board.getBoard()[row][i] != 0){
                            int temp = board.getBoard()[row][i] ;  
                            board.setBoard(row,i,0) ; 
                            board.setBoard(row,j++,temp) ;
                        }
                    }
                }
            }else if(move==1){//if board is 1 we move right

                for(int row = 0 ; row<4 ; row++){
                    int j = 3 ; 
                    for(int i=3 ; i>=0 ; i--){
                        if(board.getBoard()[row][i] != 0){
                            int temp = board.getBoard()[row][i] ;  
                            board.setBoard(row,i,0) ; 
                            board.setBoard(row,j--,temp) ;
                        }
                    }
                }
                

                //now we make the operations . 
                for(int row = 0 ; row<4 ; row++){
                    for(int i = 0 ; i<3 ; i++){
                        if(board.getBoard()[row][i]==0) continue ; 

                        if(board.getBoard()[row][i] == board.getBoard()[row][i+1]){
                            board.setBoard(row,i+1, 2*board.getBoard()[row][i] );
                            board.setBoard(row,i,0) ; 
                            i++ ; //to prevent multiple combing for same element 
                        }
                    }
                }
                //again move them to the right 
                for(int row = 0 ; row<4 ; row++){
                    int j = 3 ; 
                    for(int i=3 ; i>=0 ; i--){
                        if(board.getBoard()[row][i] != 0){
                            int temp = board.getBoard()[row][i] ;  
                            board.setBoard(row,i,0) ; 
                            board.setBoard(row,j--,temp) ;
                        }
                    }
                }



            }else if(move==2){//if move is 2 we move top ; 

                for(int col = 0 ; col<4 ; col++){
                    int j = 0 ; 
                    for(int i=0 ; i<4 ; i++){
                        if(board.getBoard()[i][col] != 0){
                            int temp = board.getBoard()[i][col] ;  
                            board.setBoard(i,col,0) ; 
                            board.setBoard(j++,col,temp) ;
                        }
                    }
                }
                

                //now we make the operations . 
                for(int col = 0 ; col<4 ; col++){
                    for(int i = 3 ; i>0 ; i--){
                        if(board.getBoard()[i][col]==0) continue ; 

                        if(board.getBoard()[i][col] == board.getBoard()[i-1][col]){
                            board.setBoard(i-1,col, 2*board.getBoard()[i][col] );
                            board.setBoard(i,col,0) ; 
                            i-- ; //to prevent multiple combing for same element 
                        }
                    }
                }
                //again move them toward up 
                for(int col = 0 ; col<4 ; col++){
                    int j = 0 ; 
                    for(int i=0 ; i<4 ; i++){
                        if(board.getBoard()[i][col] != 0){
                            int temp = board.getBoard()[i][col] ;  
                            board.setBoard(i,col,0) ; 
                            board.setBoard(j++,col,temp) ;
                        }
                    }
                }

            }else if(move==3){//if move is 3 we move bottom ; 
                

                for(int col = 0 ; col<4 ; col++){
                    int j = 3 ; 
                    for(int i=3 ; i>=0 ; i--){
                        if(board.getBoard()[i][col] != 0){
                            int temp = board.getBoard()[i][col] ;  
                            board.setBoard(i,col,0) ; 
                            board.setBoard(j--,col,temp) ;
                        }
                    }
                }
                

                //now we make the operations . 
                for(int col = 0 ; col<4 ; col++){
                    for(int i = 0 ; i<3 ; i++){
                        if(board.getBoard()[i][col]==0) continue ; 

                        if(board.getBoard()[i][col] == board.getBoard()[i+1][col]){
                            board.setBoard(i+1,col, 2*board.getBoard()[i][col] );
                            board.setBoard(i,col,0) ; 
                            i++ ; //to prevent multiple combing for same element 
                        }
                    }
                }
                //again move them towards bottom  
                for(int col = 0 ; col<4 ; col++){
                    int j = 3 ; 
                    for(int i=3 ; i>=0 ; i--){
                        if(board.getBoard()[i][col] != 0){
                            int temp = board.getBoard()[i][col] ;  
                            board.setBoard(i,col,0) ; 
                            board.setBoard(j--,col,temp) ;
                        }
                    }
                }
            }

            //write for move 1, move 2 , move 3 . 
            
            
            board.addRandom();

            board.printBoard();



        
        }
        scx.close() ; 


        
    }

}
