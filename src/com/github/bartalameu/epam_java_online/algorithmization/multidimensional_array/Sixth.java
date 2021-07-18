package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

public class Sixth {
    public static void main(String[] args) {

        int n = 6;
        int[][] arr = new int[n][n];
        int count_left = 1;
        int count_right = n;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {

                if (j + 1 >= count_left && count_right >= j + 1) {
                    arr[i][j] = 1;
                }
                if (count_left < j + 1 && count_right < j + 1) {
                    arr[i][j] = 0;
                }

                System.out.print(arr[i][j] + " ");

            }


            if (count_left == n / 2) {
                flag = false;
            }

            if (flag) {
                count_left++;
                count_right--;
            }
            if (!flag) {
                count_left--;
                count_right++;
            }


            System.out.println();
        }
    }
}
