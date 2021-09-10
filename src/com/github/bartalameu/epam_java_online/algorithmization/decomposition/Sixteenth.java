package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {
        findSumOddNum(inputOddNumber(), inputOddNumber());
    }


    private static void findSumOddNum(int odd_1, int odd_2) {
        int sum;
        if (odd_1 != 0 && odd_2 != 0) {
            sum = odd_1 + odd_2;
            int even_num = countEvenNum(sum);
            System.out.println("Sum from  odd= " + odd_1 + " and odd= " + odd_2 + "= " + sum
                    + " and has " + even_num + " even numbers."
            );
        } else System.out.println("One of the inputted numbers has a null. Please, input only odd numbers");

    }

    private static int inputOddNumber() {
        System.out.println("Enter odd number :");
        int p;
        try {
            Scanner sc = new Scanner(System.in);
            p = sc.nextInt();
            if (!checkIfAllOdd(p)) return p;
            else System.out.println("You tipped not an odd number.");
        } catch (InputMismatchException e) {
            System.out.println("You tipped wrong type of argument, use only Integer. ");
        }
        return 0;
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

    private static boolean checkIfAllOdd(int num) {
        int[] arr = separate_int(num);
        boolean even = false;
        for (int j : arr) {
            if (j % 2 == 0) {
                even = true;
                break;
            }
        }
        return even;
    }

    private static int countEvenNum(int num) {
        int[] arr = separate_int(num);
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
