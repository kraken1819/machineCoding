package com.rafee.snakeandladders.model;

import java.util.Random ;
public class Dice {

    private int numberOfDice ;

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice ;
    }

    public int rollDice(){
        Random random = new Random() ;
        return random.nextInt(numberOfDice*6)+1 ;
    }


}
