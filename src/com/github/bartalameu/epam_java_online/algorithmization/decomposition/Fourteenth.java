package com.github.bartalameu.epam_java_online.algorithmization.decomposition;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourteenth {

    public static void main(String[] args) {
        rude_search(inputBorder());
    }


    private static void rude_search(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (isPerfectDigitalInvariant(i)) {
                System.out.println(i + " ");
            }
        }
    }

    private static int check_class_int(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    static boolean isPerfectDigitalInvariant(int x) {

        int fixed_power = check_class_int(x);
        int temp = x, sum = 0;
        while (temp > 0) {

            int r = temp % 10;
            sum += Math.pow(r, fixed_power);
            temp = temp / 10;
        }

        return sum == x;
    }

    //Armstrong number (a)
    private static int inputBorder() {
        System.out.println("Enter given number limit for searching PPDI:");
        int a;
        try {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println("The Armstrong numbers for tipped limit : ");
            return a;
        } catch (InputMismatchException e) {
            System.out.println("You tipped wrong type of argument, use only Integer. ");
        }

        return 0;
    }


}
