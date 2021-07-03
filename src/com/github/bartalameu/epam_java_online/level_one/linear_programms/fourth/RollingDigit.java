package com.github.bartalameu.epam_java_online.level_one.linear_programms.fourth;

import java.util.Scanner;

/*
Decision 4th task in Linear Programms
 */
public class RollingDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type double in format nnn.ddd= ");
        double num = scanner.nextDouble();
        double answ = invert(num);
        System.out.println("answer " + answ);

    }

    static double invert(double dg) {
        StringBuilder sb = new StringBuilder();
        String queue = sb.append(dg).toString();
        String start = queue.substring(0, 3);
        String end = queue.substring(4, 7);
        sb.setLength(0);
        sb.append(end);
        sb.append(start);
        double answ = Double.parseDouble(sb.toString());
        return answ / 1000;
    }

}

