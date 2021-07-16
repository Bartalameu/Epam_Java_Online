package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

public class Tenth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 5, 43, 50, 60, 70, 24, 56, -4, 5, -65, -3, 6, 14, 1};
        System.out.println("Before making every second numbers to zero: ");
        display(arr);
        arr = zero_for_two(arr);
        System.out.println("\nAfter changing: ");
        display(arr);
        System.out.println("\nCompressed array : ");
        arr = compres_arr(arr);
        display(arr);


    }

    public static void display(int[] arr) {
        for (int x : arr
        ) {
            System.out.print(x + " ");
        }
    }

    public static int[] zero_for_two(int[] arr) {
        for (int x = 1; x <= arr.length - 1; x += 2) {
            arr[x] = 0;
        }
        return arr;
    }

    public static int[] compres_arr(int[] arr) {

        for (int i = 0; i <= arr.length - 1; i++) {
            if (i != 0) {
                for (int j = i; j > 0; j--) {
                    if (arr[j - 1] == 0 && arr[j] != 0) {
                        int temp = arr[j];
                        arr[j - 1] = temp;
                        arr[j] = 0;
                    }
                }

            }
        }
        return arr;
    }
}
