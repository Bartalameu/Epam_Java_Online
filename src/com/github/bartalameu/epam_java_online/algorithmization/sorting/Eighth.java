package com.github.bartalameu.epam_java_online.algorithmization.sorting;


public class Eighth {
    public static void main(String[] args) {
        Fraction[] arr = generateArray(10);
        System.out.println("Generated array:");
        display(arr);
        findCommonDenominator(arr);
        System.out.println("\n");
        System.out.println("After bringing to a common denominator: ");
        display(arr);
        System.out.println("\n");
    }


    private static Fraction[] generateArray(int n) {
        Fraction[] fr = new Fraction[n];
        for (int i = 0; i < fr.length; i++) {
            int numerator = (int) (Math.random() * 9) + 1;
            int denominator = (int) (Math.random() * 9) + 1;
            fr[i] = new Fraction(numerator, denominator);
        }
        return fr;
    }

    private static void display(Fraction[] arr) {
        for (Fraction x : arr
        ) {
            System.out.print(x.toString() + "  ");
        }
    }

    private static void findCommonDenominator(Fraction[] arr) {
        int m = 0;
        int a , b ;
        if (arr.length > 1) {
            a = arr[0].denominator;
            b = arr[1].denominator;
            m = calcLCM(a, b);
        }

        for (int i = 2; i < arr.length; i++) {
            int temp = m;
            m = calcLCM(temp, arr[i].denominator);
        }

        for (Fraction fraction : arr) {
            int d = m / fraction.denominator;
            fraction.numerator *= d;
            fraction.denominator *= d;
        }
    }

    //Calculate greatest common divider (GCD) for fraction
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


    //Least Common Multiple (LCM) НОК
    public static int calcLCM(int x, int y) {
        return x * (y / calcGCD(x, y));
    }
}

class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numr, int denr) {
        numerator = numr;
        denominator = denr;

    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}



