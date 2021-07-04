package com.github.bartalameu.epam_java_online.basics_of_software_code_development.linear_programms.fifth;

import java.util.Scanner;

public class ConverterDigitsToClock {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Clock time = new Clock(scanner.nextInt());
        System.out.println( time.convert());


    }
}
