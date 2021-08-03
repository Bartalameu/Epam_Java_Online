package com.github.bartalameu.epam_java_online.algorithmization.sorting;

public class Third {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 8, 10, 11, 25, 30, 31, 32, 45, 50, 100};

        display_arr(selection_sorting(arr));
    }

    public static void display_arr(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] selection_sorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int cursor = i;
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    cursor = j;
                    max = arr[j];
                }
            }
            arr[cursor] = arr[i];
            arr[i] = max;
        }
        return arr;
    }


}
