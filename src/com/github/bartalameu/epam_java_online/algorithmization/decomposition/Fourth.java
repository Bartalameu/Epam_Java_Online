package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

public class Fourth {
    public static void main(String[] args) {
        /*Supposing that x and y for point is sequence  two numbers from array
        And because of that, size of array have to be even */

        int[] arr = {2, 5, -4, -10, 10, 19, 2, 6, 0, 5, -16, 0};
        find_max_distance(arr);

    }

    private static void find_max_distance(int[] arr) {
        int x, y;
        int max_dist = 0;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.length; i= 2+i) {
            if (i + 1 < arr.length) {
                x = arr[i];
                y = arr[i + 1];
                int dist = Math.abs(Math.abs(x) - Math.abs(y));
                if (dist > max_dist) {
                    max_dist = dist;
                    str.setLength(0);
                    str.append("x= ").append(arr[i]).append(" y= ").append(arr[i+1]);
                }
            }
        }
        System.out.println("The maximum distance is (" + max_dist + ") for points \n" +str);
    }
}
