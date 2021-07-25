package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

import java.util.*;

public class Fourteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Input the number of columns:");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        if (rows < columns)
            System.out.println("Wrong input data.\nThe numbers of rows must be more than numbers of columns ");
        if (rows >= columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (j >= i) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }

            shuffle(arr,columns);
            System.out.println();
            for (int[] each : arr) {
                System.out.println(Arrays.toString(each));
            }
        }

    }

    public static void shuffle(int[][] arr, int columns) {
        Random rn = new Random();
        for (int i = 0; i <columns ; i++) {
            for (int j = arr.length-1; j > 0; j--) {
                int index = rn.nextInt(j + 1);
                int temp = arr[index][i];
                arr[index][i] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }
}
