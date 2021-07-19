package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

import java.text.DecimalFormat;


public class Seventh {
    public static void main(String[] args) {
        int n = 6;
        double[][] arr = new double[n][n];
        int count_pos=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                double result = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                DecimalFormat df = new DecimalFormat("#0.0000");
                String out = df.format(result);
                double in = Double.parseDouble(out);
                arr[i][j] = in;
                if ( arr[i][j]>0) {
                    count_pos++;
                }

            }
        }

        for (double[] doubles : arr) {
            for (double aDouble : doubles) {
                if (aDouble >= 0) {
                    System.out.format("%.4f\t", aDouble);
                }
                if (aDouble < 0) {
                    System.out.format("%.3f\t", aDouble);
                }
            }
            System.out.println();
        }


        System.out.println("\nNumbers of positive digits in array= "+count_pos);
    }
}
