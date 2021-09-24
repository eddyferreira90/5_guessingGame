package org.academiadecodigo.bootcamp;

public class GameLogic {


    public void StartGame(Player player1, Player player2, Machine pc) {
        int maxturns = 3;
        int turnsleft = 3;
        int player1Num = player1.GenerateNumber();
        int player2Num = player2.GenerateNumber();
        int pcNum = pc.GenerateNumber();
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < maxturns; i++) {
            if (player1Num == pcNum) {
                System.out.println("Congrats " + player1.GetName());
                break;
            }
            if (player2Num == pcNum) {
                System.out.println("Congrats " + player2.GetName());
                break;
            }
            if ((player1Num & player2Num) != pcNum) {

                turnsleft--;
                player1Num = player1.GenerateNumber();
                player2Num = player2.GenerateNumber();
            }
            if (turnsleft == 0) {
                System.out.println("Game over");
            }

        }


    }
}

