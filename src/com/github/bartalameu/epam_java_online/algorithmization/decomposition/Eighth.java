package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Arrays;

public class Eighth {
    public static void main(String[] args) {
        int[] arr = {5, 414, 5, 143, 1, 2, 4, 60, -50, 1, 0, 100};

        System.out.println("For array : ");
        Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
        System.out.println();
        sum_from_to(arr, 1, 3);
        sum_from_to(arr, 3, 5);
        sum_from_to(arr, 4, 6);

    }

    private static void sum_from_to(int[] arr, int k, int m) {
        int sum = 0;
        System.out.println("\nSum of numbers  from index  k=" + k + " to index m = " + m + " is");
        if (k <= m && m <= arr.length - 1) {
            for (int i = k; i <= m; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        } else System.out.println("You typed wrong limits for calculation ");
    }
}
