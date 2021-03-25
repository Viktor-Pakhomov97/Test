package com.pakhomovHW3;

import java.util.Arrays;

public class MinNumberMas {
    public static void main(String[] args) {
        // Задача 9 Дан массив размерности N, найти наименьший элемент массива и вывести
// на консоль (если наименьших элементов несколько — вывести их все).
        int[] masNumb4 = new int[12];
        int min = 15;
        int max = -15;
        int minIdex = 0;
        int maxIdex = 0;
        for (int i = 0; i < masNumb4.length; i++) {
            masNumb4[i] = (int) (Math.random() * 30 - 15);

        }
        for (int i = 0; i < masNumb4.length; i++) {
            if (masNumb4[i] < min) {
                min = masNumb4[i];
                minIdex = i;
            }
        }

        System.out.println(Arrays.toString(masNumb4));
        System.out.println("min number: " + min);
        System.out.println("minIdex: " + minIdex);
        //В массиве из задания 9. найти наибольший элемент.
        for (int i = 0; i < masNumb4.length; i++) {
            if (masNumb4[i] > max) {
                max = masNumb4[i];
                maxIdex = i;
            }
        }
        System.out.println("max number: " + max);
        System.out.println("maxIdex: " + maxIdex);
    }
}
