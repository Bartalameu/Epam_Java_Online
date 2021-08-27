package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

public class Third {
    public static void main(String[] args) {
        int a = 6;
        double hexagon_sqr= 6*triangle_square(a);
        System.out.println("Hexagon square for a= "+ a +" is " + hexagon_sqr);


    }

    private static double triangle_square ( int a ) {
        double s = ((3*Math.sqrt(3))/2)*Math.pow(a,2);

        return s;
    }
}
