package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Fourth {
    public static void main(String[] args) {
        int n =4;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            int count=n;
            for (int j = 0; j < arr[i].length; j++) {

                if ((i+1)%2!=0) {
                arr[i][j]=j+1;
                }else {
                    arr[i][j]=count;
                }
                count--;
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
}
