package com.pakhomovHW3;

public class Сhess {
    public static void main(String[] args) {
        //(*)Вывести на экран шахматную доску 8х8 в виде 2 мерного массива
        // (W - белые клетки , B - черные клети)
        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = (i + j) % 2 == 0 ? "W" : "B";
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
