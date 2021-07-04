package com.github.bartalameu.epam_java_online.basics_of_software_code_development.linear_programms.sixth;

public class SpaceChecker {
    public static void main(String[] args) {
        Point point = new Point(-7, 4);
        System.out.println("Is a point  in  coordinate system ?");
        System.out.println(check(point));

    }

    public static boolean check(Point point) {

        return point.x >= -4 && point.x <= 4 && point.y >= -3 && point.y <= 4;
    }
}
