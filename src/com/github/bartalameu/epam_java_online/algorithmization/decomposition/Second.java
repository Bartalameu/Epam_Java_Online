package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[] arr = {78, 294, 570, 36};

        int gcd = GCD(arr);
        System.out.println("The GCD for numbers " );
        Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
        System.out.println("is "+gcd);
    }

    private static int GCD(int[] arr) {
        int a, b;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && i + 1 < arr.length) {
//                Due to that  i`m  founding GCD by Euclid's theorem, (a) must be > then (b)
                if (arr[i] < arr[i + 1]) {
                    b = arr[i];
                    a = arr[i + 1];
                } else {
                    a = arr[i];
                    b = arr[i + 1];
                }

                res = evclide_theor(a, b);
                //Skip next value, because i have used it
                ++i;


            }
            if (i > 1) {
                if (arr[i] > res) {
                    a = arr[i];
                    b = res;
                } else {
                    a = res;
                    b = arr[i];
                }

                res = evclide_theor(a, b);
            }

        }
        return res;
    }

    private static void display(int[] arr) {
        for (int x : arr
        ) {
            System.out.print(x + " ");
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
