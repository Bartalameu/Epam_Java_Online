package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Second {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 10));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        StringBuilder space= new StringBuilder();
        for (int i=0; i< arr.length;i++) {
            System.out.println(space.toString() +arr[i][i]);
            space.append(" ");
        }
    }
}
