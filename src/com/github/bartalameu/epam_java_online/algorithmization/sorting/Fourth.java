package com.github.bartalameu.epam_java_online.algorithmization.sorting;
/*Mistake in task, if we have the some increasing range of numbers like a1<=a2<=...an,
in this case , it makes no sense do bubble sorting for requirement if ai<ai+1, than change value
right to left, left to right.
Because of that, i`ve done  bubble sorting for given range of numbers for case a1>=a2>=a3...>=an.
*/

public class Fourth {
    public static void main(String[] args) {
        int[] arr = {100, 50, 45, 32, 31, 30, 25, 11, 10, 8, 7, 6, 3};
        display_arr(bubble_sorting(arr));
    }
    public static void display_arr(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] bubble_sorting(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    count++;

                }
            }



        }
        System.out.println("Count of sorting= " + count);
        return arr;
    }
}
