package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

import java.util.Arrays;

public class Fourth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 5, 0, 50, 60, 70, 24, 56, -4, 5, -65, -1, 1, 14};
        System.out.println("-------Before sorting------- ");
        for (int x:
             arr) {
            System.out.print(x + " ");
        }
        Arrays.sort(arr);
        System.out.println("\n-------After sorting------- ");
        for (int x:
                arr) {
            System.out.print(x + " ");
        }
    }
}
