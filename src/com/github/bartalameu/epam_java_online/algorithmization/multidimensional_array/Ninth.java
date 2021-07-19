package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Ninth {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int sum_column=0;
        int max_sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 10));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum_column+=arr[j][i];
            }
            if (sum_column>max_sum){
                max_sum=sum_column;
            }
            System.out.println("Sum of column "+(i+1)+ "= "+ sum_column );
        }
        System.out.println("Sum of maximum elements in column= "+ max_sum );

    }

}
