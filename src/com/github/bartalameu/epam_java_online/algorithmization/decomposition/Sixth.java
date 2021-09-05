package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Arrays;

public class Sixth {
    public static void main(String[] args) {
        int[] arr = {15, 14, 25};
        System.out.println("\nFor numbers in arrays : ");
        Arrays.stream(arr).forEach(value -> System.out.print(value + " " + " \n"));
        GCD(arr);
    }

    private static void find_coprime_int(int res, int a, int b) {

        if (res == 1) {
            System.out.println("The digits " + a + ", " + b + " are coprime integers");
        } else System.out.println("The digits " + a + ", " + b + " aren`t  coprime integers");

    }

    private static void GCD(int[] arr) {
        int a, b;
        int res ;
        boolean flag = false;
        int i = 0;
        while (!flag) {
            for (int j = 1; j < arr.length; j++) {
                if (j == arr.length - 1) flag = true;
                if (arr[i] > arr[j]) {
                    a = arr[i];
                    b = arr[j];
                } else {
                    a = arr[j];
                    b = arr[i];
                }
                res = evclide_theor(a, b);
                find_coprime_int(res, a, b);
            }
        }


    }

    private static int evclide_theor(int a, int b) {
        int q, v, h;
        q = (a / b);
        v = (a % b);
        h = b;
        while (v != 0) {
            int res = (h * q) + v;
            b = h;
            h = v;
            q = b / h;
            v = b % h;
        }
        return h;
    }
}
