package com.koroka.TestTask2;

import java.util.Arrays;
import java.util.Scanner;
public class Mechanics {
    Scanner sc = new Scanner(System.in);
    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void addNubmer() {
        setSize(sc.nextInt());
        int mas[] = new int[getSize()];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        int min = mas[0] + 1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println();
        System.out.println(min);
    }
}
