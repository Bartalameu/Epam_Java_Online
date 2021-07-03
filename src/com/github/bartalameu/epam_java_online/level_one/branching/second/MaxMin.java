package com.github.bartalameu.epam_java_online.level_one.branching.second;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[][] arr = {{5, 4}, {10, 8}};
        int[] buffer = new int[arr.length];
        int count = 0;

        for (int[] array : arr) {
            int min =0;
            if (Arrays.stream(array).min().isPresent()) {
                 min = Arrays.stream(array).min().getAsInt();
            }
            buffer[count] = min;
            count++;
        }
        int max = Arrays.stream(buffer).max().getAsInt();
        System.out.println(max);


    }
}
