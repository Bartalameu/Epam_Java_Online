package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

import java.util.Arrays;

public class Third {
    public static void main(String[] args) {

        double[] arr = {1.0, 2.0, 0, -1.5, 0, 5.7, 0, -2, -3, 5, 7, 0};
        int zero = (int) Arrays.stream(arr).filter(value -> value == 0).count();
        int pos = (int) Arrays.stream(arr).filter(value -> value > 0).count();
        int neg = (int) Arrays.stream(arr).filter(value -> value < 0).count();
        System.out.println("Posivite numbers in array= " + pos + "\nNegative numbers in array= "+ neg + "\nZero  numbers in array= "+ zero);
    }
}
