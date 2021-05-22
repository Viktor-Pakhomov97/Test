package com.pakhomovHW16;

import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        User us1 = new User("Viktor");
        Game game1 = new Game();
        System.out.println(game1.printCondition(us1.getNameUser()));

        game1.startGame();
        game1.printResult();
    }
}