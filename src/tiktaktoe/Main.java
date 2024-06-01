package tiktaktoe;

import java.util.Scanner ;

import tiktaktoe.model.Player ;
import tiktaktoe.model.Board ;
import tiktaktoe.service.TikTakToeService ;
public class Main {


    public static void main(String[] args) {

        Scanner scx = new Scanner(System.in) ;

        Player p1 = new Player() ;
        p1.setSymbol(scx.next().charAt(0)) ;
        p1.setName(scx.next()) ;

        Player p2 = new Player() ;
        p2.setSymbol(scx.next().charAt(0)) ;
        p2.setName(scx.next()) ;

        Board board = new Board() ;

        TikTakToeService tiktaktoeservice = new TikTakToeService(board,p1,p2) ;

        tiktaktoeservice.startGame() ;


    }
}
