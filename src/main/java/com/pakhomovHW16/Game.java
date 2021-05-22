package com.pakhomovHW16;

import java.util.Random;
import java.util.Scanner;

public class Game {
    User us = new User();
    private String rock = "Камень";
    private String scissors = "Ножницы";
    private String paper = "Бумага";
    public int numberGame;
    private int victoryGameUser;
    private int victoryGameComp;

    public int getVictoryGameUser() {
        return victoryGameUser;
    }

    public int getVictoryGameComp() {
        return victoryGameComp;
    }

    public void setVictoryGameComp(int victoryGameComp) {
        this.victoryGameComp = victoryGameComp;
    }

    public void setVictoryGameUser(int victoryGameUser) {
        this.victoryGameUser = victoryGameUser;
    }

    Scanner sc = new Scanner(System.in);

    public String getRock() {
        return rock;
    }

    public String getScissors() {
        return scissors;
    }

    public String getPaper() {
        return paper;
    }

    public String printCondition(String name) {
        return "Добрый день, " + name + "! \n" + "Это старая, добрая игра 'Камень-ножницы-бумага'. \n" +
                "Введите кол-во попыток: ";
    }

    private enum Condition {
        КАМЕНЬ, НОЖНИЦЫ, БУМАГА;

        public int compareCondition(Condition otherC) {
            if (this == otherC)
                return 0;
            switch (this) {
                case КАМЕНЬ:
                    return (otherC == НОЖНИЦЫ ? 1 : -1);
                case БУМАГА:
                    return (otherC == КАМЕНЬ ? 1 : -1);
                case НОЖНИЦЫ:
                    return (otherC == БУМАГА ? 1 : -1);
            }
            return 0;
        }
    }

    public Condition getMoveUser() {
        String user = sc.nextLine();
        user = user.toUpperCase();//!!!
        char firstLetter = user.charAt(0);
        if (firstLetter == 'К' || firstLetter == 'Н' || firstLetter == 'Б') {
            // Ввод корректный
            switch (firstLetter) {
                case 'К':
                    return Condition.КАМЕНЬ;
                case 'Н':
                    return Condition.НОЖНИЦЫ;
                case 'Б':
                    return Condition.БУМАГА;
            }
        }
        return getMoveUser();
    }

    public Condition getMoveComputer() {
        Condition[] condition = Condition.values();
        Random random = new Random();
        int index = random.nextInt(condition.length);
        System.out.println(condition[index]);
        return condition[index];
    }

    public void startGame() {
        Scanner sc1 = new Scanner(System.in);
        int numberP = sc1.nextInt();
        System.out.println("Введите ваше значение: ");
        do {
            Condition usUser = getMoveUser();
            Condition usComp = getMoveComputer();
            int result = usUser.compareCondition(usComp);
            if (result == 0) {
                System.out.println("Ничия");
                numberGame++;
                System.out.println("Хотите продолжить? Да/Нет");
                Scanner sc2 = new Scanner(System.in);
                String againt = sc2.nextLine();
                if (againt.equals("нет")) {
                    break;
                }

            } else if (result == 1) {
                setVictoryGameComp(victoryGameUser++);
                numberGame++;
                System.out.println("Хотите продолжить? Да/Нет");
                Scanner sc2 = new Scanner(System.in);
                String againt = sc2.nextLine();
                if (againt.equals("нет")) {
                    break;
                }


            } else if (result == -1) {
                setVictoryGameComp(victoryGameComp++);
                numberGame++;
                System.out.println("Хотите продолжить? Да/Нет");
                Scanner sc2 = new Scanner(System.in);
                String againt = sc2.nextLine();
                if (againt.equals("нет")) {
                    break;
                }
            }
        } while (numberP != numberGame);

    }

    public void printResult() {
        System.out.println("Кол-во побед: " + getVictoryGameUser());
        System.out.println("Кол-во игр: " + numberGame);
    }

}

