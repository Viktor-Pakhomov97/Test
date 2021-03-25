package com.pakhomovHW3;

public class NegativeNumb {
    public static void main(String[] args) {
        //Задача 6 Вывести 10 первых чисел последовательности 0, -5,-10,-15,-20,-25,-30,-35,-40,-45
        int number2 = 1;
        for (int i = 0; i < 46; i++) {
            number2--;
            if (number2 % 5 == 0) {
                System.out.print(number2 + " ");

            }
        }
    }
}
