package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Arrays;

public class Fifth {
    public static void main(String[] args) {
        int[] arr = {1, 42, 0, 2, 4, 5, 100, 500, 2, 13, -24, 160, 0, 14};
        System.out.println("For array :");
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        int beta_max = finder_beta_max(arr, finder_alpha_max(arr));
        System.out.println("\nThe second largest digit is= " + beta_max);
    }

    private static int finder_alpha_max(int[] arr) {
        int alpha_max = 0;
        for (int k : arr) {
            int count_alpha = 0;
            for (int i : arr) {
                if (k > i) count_alpha++;
                if (count_alpha == arr.length - 1) {
                    alpha_max = k;
                    count_alpha = 0;
                }
            }
        }
        return alpha_max;
    }

    private static int finder_beta_max(int[] arr, int alpha_max) {
        int beta_max = 0;
        for (int k : arr) {
            int count_beta = 0;
            for (int i : arr) {
                if (k > i && k < alpha_max || k == i) {
                    count_beta++;
                }
                if (count_beta == arr.length - 1) {
                    beta_max = k;
                    count_beta = 0;
                }
            }
        }
        return beta_max;
    }
}
