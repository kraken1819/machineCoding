package snakeandladder.model;

import java.util.HashMap ;
import java.util.ArrayList ;

public class Board {

    private HashMap<Integer,Integer> snakes ;
    private HashMap<Integer,Integer> ladders ;
    private ArrayList<Player> players ;


    public Board(){
        this.snakes = new HashMap<>() ;
        this.ladders = new HashMap<>() ;
        this.players = new ArrayList<>() ;
    }

    public Board(HashMap<Integer,Integer> snakes , HashMap<Integer,Integer> ladders , ArrayList<Player> players){
        this.snakes = snakes ;
        this.ladders = ladders ;
        this.players = players ;
    }

    public HashMap<Integer,Integer> getSnakes(){
        return snakes ;
    }
    public HashMap<Integer,Integer> getLadders(){
        return ladders ;
    }
    public ArrayList<Player> getPlayers(){
        return players ;
    }

}
