package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifteenth {
    public static void main(String[] args) {

        findAscendingSequence(inputNumberBase());

    }

    private static void findAscendingSequence(int base) {
        if (base == 1) {
            System.out.println("The base of number should be more then 1!");
            return;
        }
        boolean zero = false;
        int[] arr = new int[base];
        arr[0] = 1;

            while (!zero) {
                for (int i = 0; i < arr.length; i++) {

                    if (i + 1 <= arr.length - 1) {
                        if (arr[i] <= arr[i + 1]) arr[i] = arr[i + 1];
                        if (arr[i] >= arr[i + 1]) arr[i + 1] = arr[i] + 1;

                    }
                    if (arr[arr.length - 1] >= 9) zero = true;

                }
                Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
                System.out.println();
            }
        }


    private static int inputNumberBase() {
        System.out.println("Enter number of base:");
        int p;
        try {
            Scanner sc = new Scanner(System.in);
            p = sc.nextInt();
            return p;
        } catch (InputMismatchException e) {
            System.out.println("You tipped wrong type of argument, use only Integer. ");
        }
        return 0;
    }

}
