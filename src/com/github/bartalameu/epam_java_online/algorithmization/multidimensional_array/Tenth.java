package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Tenth {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + 1) % 2 > 0 && (j + 1) % 2 > 0) {
                    arr[i][j] = ((int) (Math.random() * (-10)));
                }
                if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0) {
                    arr[i][j] = ((int) (Math.random() * 10));
                }
                System.out.format("%3s\t", arr[i][j]);
            }
            System.out.println();
        }

        StringBuilder space = new StringBuilder();
        String sp="";
        System.out.println("Positive element in massive : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( i==j && arr[i][j] > 0) {
                    space.append(arr[i][j]);
                }

            }
            space.append("\n");
            sp+="\t  ";
            space.append(sp);
        }
        System.out.println(space);
    }
}
