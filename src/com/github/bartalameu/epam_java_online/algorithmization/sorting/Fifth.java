package com.github.bartalameu.epam_java_online.algorithmization.sorting;

public class Fifth {

    private int[] mass = {1, 10, 23, 4, 0, 5, 1, 4, 5, 6, 7, 15, 60, 16, 12};

    public static void main(String[] args) {
        Fifth fif = new Fifth();
        System.out.println("Before sorting");
        display_arr(fif.mass);
        System.out.println("After sorting");
        fif.inserting_sort();

    }

    public void inserting_sort() {
        int key;
        int pos;
        for (int i = 1; i < mass.length; i++) {
            key = mass[i];
            pos = binarySearch(0, i - 1, key);
            if (i - pos >= 0) System.arraycopy(mass, pos, mass, pos + 1, i - pos);
            mass[pos] = key;
        }
        display_arr(mass);
    }

    public int binarySearch(int low,int high,int key){
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(key>mass[mid]) {
                low = mid + 1;
            }
            else if(key<mass[mid]) {
                high=mid-1;
            }

            else{
                return mid;
            }

        }
        return low;
    }

    public static void display_arr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
