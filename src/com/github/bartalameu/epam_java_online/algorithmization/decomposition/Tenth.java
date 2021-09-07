package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Arrays;

public class Tenth {
    public static void main(String[] args) {
        int x = 12344566;
        int[] arr;
        arr = separate_int(x);
        System.out.println("The array from integer " + x);
        Arrays.stream(arr).forEach(value -> System.out.print
                (value + " "));

    }

    private static int[] separate_int(int x) {
        int[] arr = new int[check_class_int(x)];
        int count = arr.length - 1;
        while (x > 0) {
            arr[count] = x % 10;
            x = x / 10;
            count--;
        }
        return arr;
    }

    private static int check_class_int(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }


}
