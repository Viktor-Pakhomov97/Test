package com.pakhomovHW3;

public class СycleFor {
    public static void main(String[] args) {
        //Задача 1 При помощи цикла for вывести на экран нечетные числа от 1 до 99
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}