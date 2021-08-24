package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

public class First {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        System.out.println(calcLCM(a, b));
    }

    public static int calcLCM(int x, int y) {
        return x * (y / calcGCD(x, y));
    }

    private static int calcGCD(int x, int y) {
        int a = x;
        int b = y;
        while (a != b) {

            if (a > b) {
                a = a - b;
            } else b = b - a;
        }
        return a;
    }
}



