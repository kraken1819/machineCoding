package snakeandladder.service;

import snakeandladder.model.Board;
import snakeandladder.model.Dice;
import snakeandladder.model.Player;

import java.util.* ;
public class SnakeLadderService {

    private Board board ;
    private Dice dice ;

    public SnakeLadderService(Board board , Dice dice){
        this.board = board ;
        this.dice = dice ;
    }

    public boolean noOneWon(ArrayList<Player> players){
        boolean ans = true ;
        for(int i =0 ; i<players.size() ; i++){
            if(players.get(i).getPosition() == 100){
                ans = false ;
                break ;
            }
        }
        return ans ;
    }

    public int startGame(){
        HashMap<Integer,Integer> snakes = board.getSnakes() ;
        HashMap<Integer,Integer> ladders = board.getLadders() ;
        ArrayList<Player> players = board.getPlayers() ;

        int playerId = 0 ;
        while(noOneWon(players)){

            playerId %= players.size() ;

            int diceValue = dice.rollDice() ;

            int pScore = players.get(playerId).getPosition() ;
            String pName = players.get(playerId).getName() ;

            if(diceValue+pScore<=100){
                pScore += diceValue ;
            }

            if(snakes.containsKey(pScore)){
                pScore = snakes.get(pScore) ;
                //System.out.println(pName + " rolled a " + diceValue + " and moved from " + players.get(playerId).getPosition() + " to " + pScore + " snake.") ;
            }else if(ladders.containsKey(pScore)){
                pScore = ladders.get(pScore) ;
                //System.out.println(pName + " rolled a " + diceValue + " and moved from " + players.get(playerId).getPosition() + " to " + pScore + " ladder. ") ;
            }else {
               // System.out.println(pName + " rolled a " + diceValue + " and moved from " + players.get(playerId).getPosition() + " to " + pScore) ;
            }

            System.out.println(pName + " rolled a " + diceValue + " and moved from " + players.get(playerId).getPosition() + " to " + pScore) ;

            players.get(playerId).setPosition(pScore) ;
            playerId++ ; //player take turns .
        }
        int winnerId = playerId-1 ;
        return winnerId ;
    }







}
