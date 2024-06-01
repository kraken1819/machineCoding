package tiktaktoe.model;

public class Player {

    private char symbol ;
    private String name ;

    public Player(){
        this.symbol = '\u0000' ;
        this.name = null ;
    }

    public Player(char symbol,String name) {
        this.symbol = symbol ;
        this.name = name ;
    }

    public void setSymbol(char symbol){
        this.symbol = symbol ;
    }
    public void setName(String name) {
        this.name= name ;
    }



    public char getSymbol(){
        return symbol ;
    }
    public String getName(){
        return name ;
    }

}
