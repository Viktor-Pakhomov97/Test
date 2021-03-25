package com.pakhomovHW3;

import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        //Задача 4 Перепишите программы с использованием цикла do - while
        int exm = 1;
        int exm1 = 1;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        do {
            exm++;
            exm1 *= exm;
        } while (exm < number);
        System.out.println(number + "!" + " = " + exm1);
    }
}
