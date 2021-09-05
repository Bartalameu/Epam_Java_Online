package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

public class Seventh {
    public static void main(String[] args) {
        System.out.println("Sum for odd digits from 1 to 9 = " + sum_factorial_odd(9));
    }

    private static int sum_factorial_odd(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i++) {
            if (i % 2 != 0) {
                sum = sum + factorial(i);
            }
        }
        return sum;
    }

    private static int factorial(int y) {
        int fact = 1;
        for (int i = 2; i <= y; i++) {
            fact *= i;
        }
        return fact;


    }
}
