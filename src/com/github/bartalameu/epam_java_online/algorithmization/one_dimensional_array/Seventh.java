package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

public class Seventh {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 5, 0, 50, 60, 70, 24, 56, -4, 5, -65, -3, 6, 14};
        int n = arr.length - 1;
        int min = 0;
        int max = 0;
        int[] maxArr = new int[2];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                min = arr[i] + arr[n];
                n--;
                continue;
            }
            if (i == (arr.length - 1) / 2) {
                max = arr[i] + arr[i + 1];
                maxArr[0] = arr[i];
                maxArr[1] = arr[i + 1];
            }
            if (i < (arr.length - 1) / 2) {
                max = arr[i] + arr[n];
                maxArr[0] = arr[i];
                maxArr[1] = arr[n];
                n--;
            }

            if (max < min) {
                min = max;
            }

        }
        System.out.println("In array : ");
        for (int x :arr
             ) {
            System.out.print(x+" ");
        }
        System.out.println("\nMax= " + max + " a1=" + maxArr[0] + " a2=" + maxArr[1]);

    }
}
