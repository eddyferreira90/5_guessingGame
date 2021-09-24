package org.academiadecodigo.bootcamp;

public class Machine {

    private String name;
    private int number;

    public Machine(String name) {
        this.name = name;


    }

    public String GetName() {
        return name;
    }

    public int GenerateNumber() {
        number = (int) Math.ceil(Math.random() * 10);
        System.out.println(number);
        return number;
    }
}

