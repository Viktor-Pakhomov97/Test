package com.pakhomovHW3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        //Задача 3 Перепишите программы с использованием цикла while
        int exm = 1;
        int exm1 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        while (exm < number) {
            exm++;
            exm1 *= exm;
            if (exm == number) {
                System.out.println(number + "!" + " = " + exm1);
            }
        }
    }
}
