package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 10));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________ Before sorting ______________");
        System.out.println("""
                Choose variant of sorting column:\s
                1- for sorting from smaller to larger :
                2- for sorting from a larger to smaller :\s""");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1 -> sort_increase(arr);
            case 2 -> sort_decrease(arr);
            default -> System.out.println("Input wrong.");
        }
    }

    public static void sort_increase(int[][] arr) {
        System.out.println(" You chose  first variant.");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j > 0; j--) {
                for (int b = 0; b < j; b++) {
                    if (arr[b][i] > arr[b+1][i]) {
                        int temp = arr[b+1][i];
                        arr[b+1][i] = arr[b][i];
                        arr[b][i] = temp;
                    }
                }
            }
        }
        System.out.println("______________ After sorting ______________");
        display(arr);
    }

    public static void sort_decrease(int[][] arr) {
        System.out.println(" You chose  second   variant.");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j > 0; j--) {
                for (int b = 0; b < j; b++) {
                    if (arr[b][i] < arr[b+1][i]) {
                        int temp = arr[b+1][i];
                        arr[b+1][i] = arr[b][i];
                        arr[b][i] = temp;
                    }
                }
            }
        }
        System.out.println("______________ After sorting ______________");
        display(arr);
    }

    public static void display(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {

                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }
}
