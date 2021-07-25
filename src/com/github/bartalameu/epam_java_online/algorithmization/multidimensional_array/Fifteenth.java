package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

import java.util.Arrays;

public class Fifteenth {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        System.out.println("---------------Generated array---------------\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 10));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        search_bigger(arr);
    }

    static  void search_bigger(int [][] arr ) {
        int bigger =0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt>bigger) {
                    bigger=anInt;
                }
            }
        }
        System.out.println("\nBigger number is = "+ bigger);
        System.out.println("\n---------------Changing all odd numbers to bigger---------------");
        change_odd(arr,bigger);
    }
    static void change_odd ( int [][]arr , int bigger) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j]%2>0) {
                    arr[i][j] =bigger;
                }
            }
        }
        System.out.println();
        for (int[] each : arr) {
            System.out.println(Arrays.toString(each));
        }
    }

}
