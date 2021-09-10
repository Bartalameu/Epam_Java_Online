package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Seventeenth {
    public static void main(String[] args) {
        countSubtractingSelfSum(inputNumber());
    }


    private static void countSubtractingSelfSum(int num) {
        System.out.println("Subtracting sum of digits for number " + num);
        int[] arr = separate_int(num);
        int sub_num = num;

        int sum = 0;
        int count = 0;
        while (sub_num > 0) {
            Arrays.stream(arr).forEach(System.out::print);
            for (int j : arr) {
                sum += j;
            }
            sub_num = sub_num - sum;
            count++;
            arr = separate_int(sub_num);
            sum = 0;
            System.out.println();
            if (arr.length == 0) System.out.println(0);


        }
        System.out.println("count of subtracting " + count);
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

    private static int inputNumber() {
        System.out.println("Enter  number :");
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
