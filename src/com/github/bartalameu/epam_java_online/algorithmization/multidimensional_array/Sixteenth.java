package com.github.bartalameu.epam_java_online.algorithmization.multidimensional_array;

import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an odd number: ");
        int n = scan.nextInt();
        if ((n % 2 == 0) || (n <= 0)) {
            System.out.print("Input number must be odd and >0");
            System.exit(0);
        }

        int[][] magic_square = new int[n][n];
        int max_num = n * n;
        int row = n / 2;
        int col = n - 1;
        int num = 1;
        magic_square[row][col] = num;
        num++;
        for (int i = col; i <= max_num; i++) {
            row -= 1;
            col += 1;
            //3nd condition

            if ((row == -1 && col == n)) {
                row = 0;
                col = n - 2;
            }
            //1st condition
            if (row == -1) {
                row = n - 1;
            }
            if (col == n) {
                col = 0;
            }
            //2rd condition
            if (magic_square[row][col] >= 1 && magic_square[row][col] <= max_num) {
                row = row + 1;
                col = col - 2;
            }

            magic_square[row][col] = num;
            num++;


        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (magic_square[i][j] < 10) System.out.print(" ");
                if (magic_square[i][j] < 100) System.out.print(" ");
                System.out.print(magic_square[i][j] + " ");
            }
            System.out.println();
        }

    }
}
