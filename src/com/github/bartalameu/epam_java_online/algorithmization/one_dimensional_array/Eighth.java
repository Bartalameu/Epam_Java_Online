package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

import java.util.Arrays;

public class Eighth {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 10, 5, 0, 50, 60, 70, 24, 56, -4, 5, -65, -3, 6, 14};
        System.out.println("Before sorting : ");
        for (int x :arr
             ) {
            System.out.print( x+ " ");
        }
        int cursor=0;
        int min = 0;
        for (int x : arr
        ) {
            if (x < min) {
                min = x;
            }

        }
        System.out.println("\nLower element in array= " + min);
        int finalMin = min;
        int count = (int) Arrays.stream(arr).filter(i -> i == finalMin).count();

        int[] sort_arr=new int[arr.length-count];

        for (int x : arr) {
            if (x != min) {
                sort_arr[cursor] = x;
                cursor++;
            }
        }
        System.out.println("After sorting ");
        for (int x :sort_arr
             ) {
            System.out.print(x+" ");
        }

    }
}
