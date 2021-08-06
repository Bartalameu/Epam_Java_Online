package com.github.bartalameu.epam_java_online.algorithmization.sorting;

public class Sixth {
    private double[] mass = {1.55, 10, -5.5, 4, 0, 5, 12.4444, 4, -.3333, 6, 7, 123, 60, 1.3441, 12};

    public static void main(String[] args) {
        Sixth sixth = new Sixth();
        System.out.println("Array before sorting :");
        display_arr(sixth.mass);
        System.out.println("Array after sorting :");
        display_arr(sixth.shell_sorting(sixth.mass));
    }

    public double[] shell_sorting(double[] mass) {
        int pos = 0;
        while (pos < mass.length - 1) {
            if (mass[pos] <= mass[pos + 1]) {
                pos++;
            } else   {
                double temp = mass[pos];
                mass[pos] = mass[pos + 1];
                mass[pos + 1] = temp;
                if ( pos!=0){
                    --pos;
                }
            }
        }


        return mass;
    }

    public static void display_arr(double[] arr) {
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
}
