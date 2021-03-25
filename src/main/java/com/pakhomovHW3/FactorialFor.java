package com.pakhomovHW3;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        //Задача 2 Дано число n при помощи цикла for посчитать факториал n!
        int n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            n *= i;

        }
        System.out.println(number + "!" + " = " + n);
    }
}
