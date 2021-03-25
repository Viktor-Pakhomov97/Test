package com.pakhomovHW3;

import java.util.Arrays;

public class SwapElemMas {
    public static void main(String[] args) {
        int[] mas = {4, -5, 0, 6, 8};
        System.out.println(Arrays.toString(mas));
        int swap = 0;
        swap=mas[1];
        mas[1]=mas[4];
        mas[4]=swap;
        System.out.println(Arrays.toString(mas));
    }
}
