package com.bridgelabz.functionalproblems;

import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Column = scanner.nextInt();
        int Row = scanner.nextInt();
        int[][] Array = new int[Row][Column];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.println(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}