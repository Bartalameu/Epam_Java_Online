package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

import java.util.Arrays;

public class Fifth {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 10, 5, 0, 50, 60, 70, 24, 56, -4, 5, -65, -1, 1, 14};
        int i= 3;
        Arrays.stream(arr).forEach(value -> {
            if (value > i) {
                System.out.println("The value "+value + ">"+ i);
            }
        });
    }
}
