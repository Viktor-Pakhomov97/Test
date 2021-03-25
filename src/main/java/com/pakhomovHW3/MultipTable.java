package com.pakhomovHW3;

import java.util.Scanner;

public class MultipTable {
    public static void main(String[] args) {
        //Задача 7 Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number3 = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int result = i * number3;
            System.out.println(number3 + "*" + i + "=" + result);
        }
    }
}
