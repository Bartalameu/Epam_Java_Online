package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Fifth {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];
        int count = n-1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (j <= count) {
                    arr[i][j] = i + 1;
                }
                if (j > count) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            count--;
            System.out.println();
        }
    }
}
