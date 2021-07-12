package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Second {

    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 5.5, 6.7, 2.0, 10.0, 2.0, 1.2, 2.0};
        int length = arr.length;
        double z = 2.0;
        AtomicInteger count = new AtomicInteger();
        IntStream.range(0, length).forEach(x -> {
            if (arr[x] > z) {

                System.out.println( "arr["+x+"]= "+  arr[x] +" change to " + z  );
                arr[x] = z;
                count.getAndIncrement();
            }
        });
        System.out.println("New array = ");
        for (double x : arr) {
            System.out.print(" " + x );
        }
        System.out.println("\ncount= " + count);
    }

}
