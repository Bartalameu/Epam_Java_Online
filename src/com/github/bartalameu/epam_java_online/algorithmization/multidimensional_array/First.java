package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class First {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 10));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1;
            int row = 0;
            if ( (i+1)%2!=0 && arr[row][i] > arr[last][i]) {

                for (int[] ints : arr) {
                    int column = ints[i];
                    System.out.println(column);
                }
                System.out.println();
            }
        }

    }
}
