package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Third {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 10));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int k_row= 3;
        int p_column=2;
        System.out.println("\nNumbers in row=  "+ k_row);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[k_row][i]+" ");
        }
        System.out.println("\nNumbers in column=  "+ p_column);
        for (int[] ints : arr) {
            System.out.println(ints[p_column]);
        }
    }
}
