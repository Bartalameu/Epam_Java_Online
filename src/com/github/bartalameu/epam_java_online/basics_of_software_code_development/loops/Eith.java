package com.github.bartalameu.epam_java_online.basics_of_software_code_development.loops;


public class Eith {
    public static void main(String[] args) {

        String numbers = "123 456";

        int count = 0;
        while (count <= numbers.length() - 1) {

            for (int i = 0; i <= numbers.length() - 1; i++) {
                char ch = numbers.charAt(i);

                if (ch >= '0' && ch <= '9') {
                    if (i < numbers.length() - 1) {
                        System.out.print(ch + "-");
                    } else {
                        System.out.print(ch);
                    }

                }
                count++;
            }

        }
    }
}
