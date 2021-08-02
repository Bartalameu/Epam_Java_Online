package com.github.bartalameu.epam_java_online.algorithmization.sorting;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[] first_arr = {3, 6, 4, 3, 6, 7, 9, 10, 15, 2, 15, -5, -2};
        int[] second_arr = {1, 12, 0, 3, 1, 2, 4, 8, 6, 2, -3, 9, -1, 5};
        first_arr = Arrays.stream(first_arr).sorted().toArray();
        second_arr = Arrays.stream(second_arr).sorted().toArray();
        System.out.println("First array : ");
        display_arr(first_arr);
        System.out.println("\nSecond array : " );
        display_arr(second_arr);

        // Method new_arr(), return first_arr whith changed value which we get from second_arr,
        //if they more than value in first_arr

        System.out.println("\nNew sequence  : ");
        display_arr(new_arr(first_arr, second_arr));
    }



    public static void display_arr(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] new_arr(int[] first_arr, int[] second_arr) {

        for (int i = 0; i <= first_arr.length - 1; i++) {
            if (first_arr[i] < second_arr[i]) {
                first_arr[i] = second_arr[i];
            }
        }
        return Arrays.stream(first_arr).sorted().toArray();
    }

}

