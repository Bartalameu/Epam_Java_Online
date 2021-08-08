package com.github.bartalameu.epam_java_online.algorithmization.sorting;

public class Seventh {
    public static void main(String[] args) {
        double[] a = {-1.0, 0.3, 0.5, 1, 5.67, 16.66, 18.56, 158.5};
        double[] b = {-3.0, -2.56, 0.151, 14, 15.67, 26.255, 30.56, 48.5};
        System.out.println("\nFirst array= " );
        display_arr(a);
        System.out.println("Second array= ");
        display_arr(b);
        shuffle(a, b);
        System.out.println("\nAfter add convenient element from second array in first = ");
        display_arr(a);
    }

    static void shuffle(double[] a, double[] b) {
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (i != 0 && i+1!=a.length) {

                    if (a[i - 1] < b[j] && a[i + 1] > b[j]) {
                        if (b[j] != 0) {
                            System.out.println("The number= " + "(" + a[i] + ")" + " At position " + "(" + i + ")" + " can be replace to " + "(" + b[j] + ")" + " from second array");
                            a[i] = b[j];
                            b[j] = 0;//Make zero  in order not to repeat the value that we change at first array
                            break;
                        }
                        continue;
                    }
                }
                if (i + 1 == a.length) {
                    if (b[j] >= a[i - 1] && b[j] <= a[i]) {
                       if ( b[j]!=0) {
                           System.out.println("The number= " + "(" + a[i] + ")" + " At position " + "(" + i + ")" + " can be replace to " + "(" + b[j] + ")" + " from second array");
                           a[i] = b[j];
                           b[j] = 0;//Make zero  in order not to repeat the value that we change at first array
                           break;
                       }
                       continue;
                    }
                }
                if (i == 0) {
                    if ( b[j] < a[i + 1]) {
                        if ( b[j]!=0) {
                            System.out.println("The number= " + "(" + a[i] + ")" + " At position " + "(" + i + ")" + " can be replace to " + "(" + b[j] + ")" + " from second array");
                            a[i] = b[j];
                            b[j] = 0;//Make zero  in order not to repeat the value that we change at first array
                            break;
                        }
                    }
                }
            }
        }

    }

    public static void display_arr(double[] arr) {
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
}
