package com.pakhomovHW3;

public class OddNumbers {
    public static void main(String[] args) {
        //Задача 8 Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива
        // на консоль в одну строку,разделяя запятой.
        int mas[]=new int[20];
        for (int i = 1; i < mas.length ; i=i+2) {
            mas[i]=i;
            if( i != 19 ){
                System.out.print(mas[i] + ", ");}
            else
                System.out.print(mas[i]);
        }
    }
}
