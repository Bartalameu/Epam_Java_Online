package com.github.bartalameu.epam_java_online.algorithmization.sorting;

import java.util.Scanner;

public class First {
    static int length_first_arr, length_sec_arr;

    public static void main(String[] args) {
        final int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of element for first array and second: ");
        length_first_arr = sc.nextInt();
        length_sec_arr = sc.nextInt();
        if (length_first_arr == 1) {
            System.out.println("Numbers of element in massive should be more than  1");
            System.exit(0);
        } else if (length_sec_arr == 1) {
            System.out.println("Numbers of element in massive should be more than  1");
            System.exit(0);
        }

        System.out.println("\nFirst array: ");
        int[] arr_one = create_arr(length_first_arr + length_sec_arr);
        System.out.println("\nSecond array: ");
        int[] arr_two = create_arr(length_sec_arr);
        System.out.println("\nEnter constant (k), which must be in range, from 1 to " + (length_first_arr - 1));
        k = sc.nextInt();
        if (k > length_first_arr - 1) {
            System.out.println("\nWrong input, constant (k) must be in range!");
            System.exit(0);
        } else {
            System.out.println("\nAfter concatenation two arrays: ");
            concatenation_arr(arr_one, arr_two, k);
        }


    }

    public static int[] create_arr(int length) {

        if (length - length_sec_arr == length_first_arr) {
            int[] arr = new int[length];
            for (int i = 0; i < arr.length - length_sec_arr; i++) {
                arr[i] = (int) ((Math.random() * 346));
                if (arr[i] == 0) {
                    arr[i] = 1;
                }
            }
            display_arr(arr);

            System.out.println();
            return arr;
        }
        if (length == length_sec_arr) {
            int[] arr = new int[length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) ((Math.random() * 123));
                if (arr[i] == 0) {
                    arr[i] = 1;
                }
            }
            display_arr(arr);
            System.out.println();
            return arr;
        }

        return new int[0];

    }

    public static void concatenation_arr(int[] arr_one, int[] arr_two, int k) {

        int key=k;
        if (key == 1 || key > 1 || key + 1 <= length_first_arr) {
            key--;
        }

       int k_plus_one=key+1;

        int one_cursor = length_first_arr - 1;
        int two_cursor = arr_one.length - 1;

        for (; one_cursor >= k_plus_one; one_cursor--) {

            arr_one[two_cursor] = arr_one[one_cursor];
            arr_one[one_cursor] = 0;
            two_cursor--;
        }

        for (int i = 0; i <=arr_two.length-1 ; i++) {
            arr_one[k_plus_one]=arr_two[i];
            k_plus_one++;
        }
        display_arr(arr_one);
    }


    public static void display_arr(int[] arr) {
        System.out.println();
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}