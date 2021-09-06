package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        System.out.println("Enter values for sides (X,Y,Z,T) quadrangle : ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double t = sc.nextDouble();
        int angle_ty = 90;
        double s1= square_right_triangle(x, y, angle_ty);
        double s2=square_triangle_by_hypotenuse(z, t);
        if ( s1 >0 && s2 >0) {
            System.out.println("Sum for quadrangle with sides X=" + x + " Y=" + y + " Z=" + z + " T=" + t + " and angle 90 between TY \n"
                    + "=" +
                    sum_square(s1,s2)
            );
        }else System.out.println("Something went wrong :(");


    }

    /*Because we have only fourth sides and one angle, will find the square(s) for quadrangle dividing by two triangle,
    first right-triangle, and second  for which we can find the square(s) through hypotenuse(h) and two other sides Z and T.
    * */
    private static double square_right_triangle(double x, double y, int angle) {
        double s;
        if (angle == 90) {
            s = (x * y) / 2;
            return s;
        } else {
            System.out.println("Wrong angle for right_triangle!");
            return 0;
        }

    }

    private static double square_triangle_by_hypotenuse(double z, double t) {
        double h = Math.sqrt(Math.pow(z, 2) + Math.pow(t, 2));
        double p = (z + t + h) / 2;
        return Math.sqrt(p * (p - h) * (p - t) * (p - z));
    }

    private static double sum_square(double s1, double s2) {
        if ((s1 > 0 && s2 > 0)) {
            return s1 + s2;
        } else {
            System.out.println("One of the square is zero or less ");
            return 0;
        }
    }
}
