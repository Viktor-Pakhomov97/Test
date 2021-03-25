package com.pakhomovHW3;

public class Average {

    public static void main(String[] args) {
        int[] numbers = {5, 5, 5, 5};

        double average = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }
        System.out.println("average mas: " + average);
    }
}
