package snakeandladder;
import java.util.Scanner ;
import java.util.HashMap ;
import java.util.ArrayList ;

import snakeandladder.model.Board;
import snakeandladder.model.Dice;
import snakeandladder.model.Player;
import snakeandladder.service.SnakeLadderService;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int nSnakes = sc.nextInt() ;
        HashMap<Integer,Integer> snakes = new HashMap<>()  ;
        for(int i =0 ; i<nSnakes ; i++){
            int fromPosition = sc.nextInt() ;
            int toPosition = sc.nextInt() ;
            snakes.put(fromPosition,toPosition) ;
        }

        int nLadders = sc.nextInt() ;
        HashMap<Integer,Integer> ladders = new HashMap<>() ;
        for(int i =0 ; i<nLadders ; i++) {
            int fromPosition = sc.nextInt();
            int toPosition = sc.nextInt() ;
            ladders.put(fromPosition,toPosition) ;
        }

        int nPlayers = sc.nextInt() ;
        ArrayList<Player> players = new ArrayList<>() ;
        for(int i=0;i<nPlayers;i++){
            String name = sc.next() ;
            players.add(new Player(name)) ;
        }

        Board board = new Board(snakes,ladders,players) ;
        Dice dice = new Dice(2) ;

        // initialising the service

        SnakeLadderService slc = new SnakeLadderService(board,dice) ;
        int winnerId = slc.startGame() ;
        System.out.println(players.get(winnerId).getName() + " won the game.") ;

        sc.close() ; 

    }
}
