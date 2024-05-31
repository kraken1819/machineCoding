package com.rafee.snakeandladders.model;

public class Player {


    private final String name ;
    private int position ;

    public Player(String name){
        this.name=name;
        this.position=0 ; //default value when creating .
    }

    public void setPosition(int position){
        this.position = position ;
    }
    public String getName(){
        return name ;
    }
    public int getPosition(){
        return position ;
    }

}
