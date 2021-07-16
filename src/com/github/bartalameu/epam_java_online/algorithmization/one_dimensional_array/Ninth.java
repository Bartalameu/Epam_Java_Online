package com.github.bartalameu.epam_java_online.algorithmization.one_dimensional_array;

public class Ninth {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 0, 50, 60, 70, 24, 24, 56, -4, 5, -65, -3, 6, 14, -3, -3};

        int max_count ;
        int now_min = 0;
        int cursor=1;
        for (int x : arr
        ) {
            int count =0;
            int min = 0;
            for (int i = cursor; i <= arr.length - 1; i++) {
                if (arr[i] == x && now_min!=x) {
                    count++;
                    min = arr[i];

                }
            }
            if (count > 1 &&  now_min>min) {
                max_count=count;
                now_min=min;
                System.out.println("Min= " + now_min);
                System.out.println("count= " + max_count);
            }
            cursor++;

        }


    }
}
