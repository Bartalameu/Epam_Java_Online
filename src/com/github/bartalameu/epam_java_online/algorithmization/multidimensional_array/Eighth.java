package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number of column 1-" + n + "= ");
        int first = sc.nextInt();
        System.out.println("Input second number of column 1-" + n + "= ");
        int second = sc.nextInt();

        if (first >= 1 && second <= n && second != first) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = first - 1; j < second - 1; j++) {
                    int temp = arr[i][second - 1];
                    arr[i][second - 1] = arr[i][j];
                    arr[i][j] = temp;

                }
            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {

                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }
}
