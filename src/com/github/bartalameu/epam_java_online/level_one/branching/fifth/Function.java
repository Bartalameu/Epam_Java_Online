package com.github.bartalameu.epam_java_online.level_one.branching.fifth;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Answer is ="+ function(x));
    }

    public static double function(int x) {

        if (x <= 3) {
            return  Math.pow(x, 2) - 3 * x + 9;
        } else return  1 / (Math.pow(x, 3) + 6);
    }
}
