package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

public class Sixth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 5, 0, 50, 60, 70, 24, 56, -4, 5, -65, -1, 1, 14};
        int sum = 0;

        boolean flag =false;

        for (int x = 2; x <= arr.length - 1; x++) {
            int i=2 ;
            while (i<=x/2 ) {
                if (x % i == 0) {
                    flag=true;
                    break;
                }else {
                    flag=false;

                }
                ++i;
            }

            if (!flag) {
                sum+=arr[x];
                System.out.print( x + " ");
            }

        }
        System.out.println("\nSum = " + sum);
    }
}
