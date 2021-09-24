package org.academiadecodigo.bootcamp;

public class guessingGame {

    public static void main(String[] args) {

        Player player56 = new Player("Zé");
        Player player25 = new Player("Jorge");
        Machine pctoto = new Machine("PC");


        GameLogic gameLogic = new GameLogic();
        gameLogic.StartGame(player56,player25,pctoto);

    }

}

























