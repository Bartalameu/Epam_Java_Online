package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Eleventh {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 16));
                if (arr[i][j] == 5) {
                    count++;
                }
                System.out.format("%3s\t", arr[i][j]);
            }
            if (count >= 3) {
                bld.append(i+1);
                if (i == arr.length - 1) {
                    bld.append(".");
                }
                if (i < arr.length-1) {
                    bld.append(",");
                }
            }
            System.out.println();
        }
        if (bld.isEmpty()) {
            System.out.println("\nIn massive not row when 5 is 3 or more times ");
        }
        if (!bld.isEmpty()) {

            System.out.println("\nRow when number 5 is 3 or more times: " + bld);
        }
    }
}

