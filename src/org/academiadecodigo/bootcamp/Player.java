package org.academiadecodigo.bootcamp;

public class Player {

        private String name;
        private int number;

        public Player(String name) {
                this.name = name;


        }

        public String GetName() {
                return name;
        }

        public int GenerateNumber() {
                number = (int)Math.ceil(Math.random()*10);
                System.out.println(number);
                return number;
        }











}

// public int GenerateNumber() {
//                int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//                number = (int)Math.ceil(Math.random()*10);
//                System.out.println(number);
//                return number;
//
//        }

// start()
// int gameNumber = chooseNumber();


