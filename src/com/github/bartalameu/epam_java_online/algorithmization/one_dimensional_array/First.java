package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;


import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 1, 7, 8, 1, 10};
        int k =1;
        int sum=0;
        System.out.println("For numbers in matrix ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " ") );
        for (int i : arr) {
            if ( i == k ) {
                sum+=i;
            }
        }
        System.out.println ("\nSum for K= " + k + " is= "+sum);


    }
}
