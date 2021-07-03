package com.github.bartalameu.epam_java_online.level_one.loops;

public class Third {
    public static void main(String[] args) {

        double sum =0;
        double num=0.1;
        int count = 0;
        while (count<=100) {
            sum+=num*num;
            count++;
            num+=0.01;
        }
        System.out.println("Sum first hundred numbers starting by 0.1 = " + sum);

    }
}
