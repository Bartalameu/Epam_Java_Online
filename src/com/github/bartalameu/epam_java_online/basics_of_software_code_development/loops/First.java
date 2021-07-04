package com.github.bartalameu.epam_java_online.basics_of_software_code_development.loops;



public class First {
    public static void main(String[] args) {

          int i = 1;
        int number = 50;
        int sum = 0;

        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum all numbers between 1 and " + number +" = "+ sum);


    }


}
