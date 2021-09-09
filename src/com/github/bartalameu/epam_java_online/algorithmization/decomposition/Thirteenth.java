package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        int p = inputPrimaryNumber();
        if (p != 0) {
            twinPrime(p);
        }

    }

    private static int inputPrimaryNumber() {
        System.out.println("Enter primary number:");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        boolean check_prime = checkPrime(p);
        if (check_prime) {
            return p;
        } else System.out.println("You tipped non prime number!");
        return 0;
    }

    private static boolean checkPrime(int check) {
        int rem;
        for (int i = 2; i < check; i++) {
            rem = check % i;
            if (rem == 0) return false;
        }
        return true;

    }

    private static void twinPrime(int p) {
        int border = 2 * p;
        int[] prime_arr = new int[2];
        System.out.print("Twin-prime for range "+ p +" "+border+"\n");
        for (int i = p; i < border; i += 2) {
            if (checkPrime(i)&&checkPrime(i+2)) {
                prime_arr[0] = i;
                prime_arr[1] = i + 2;
                System.out.println( prime_arr[0] + "--" + prime_arr[1]);
            }

        }

    }


}
