package com.github.bartalameu.epam_java_online.algorithmization.decomposition;


import java.util.Arrays;

public class Twelfth {
    public static void main(String[] args) {
        int k = 50;
        int n = 25;
        int[] arr = decompose(k, n);
        System.out.println("For K= "+k + " and N= "+n +" partitions of an integer N to values which less then N:  ");
        Arrays.stream(arr).forEach(value -> {
            if (value !=0) {
                System.out.print(value+" ");
            }
        });
    }

    private static int[] decompose(int k, int n) {

        int[] arr = new int[k];
            for (int i = 0; i < arr.length; i++) {
                if (k>n){
                    arr[i] = (int) (Math.random() * n) + 1;
                    k = k-arr[i];
                }else  {
                    arr[i]=k;
                    return arr;
                }
            }


        return arr;
    }

}



