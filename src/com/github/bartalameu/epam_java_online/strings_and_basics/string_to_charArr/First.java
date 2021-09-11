package com.github.bartalameu.epam_java_online.strings_and_basics.string_to_charArr;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        String[] arr_camel = {"valVal", "numNum", "carCar", "sourceSource" };
        System.out.println("Changing array with camelCase to snake_case : ");
        Arrays.stream(arr_camel).forEach(s -> System.out.print(s+" "));
        String[] arr_snake=camelToSnake(arr_camel);
        System.out.println();

    }

    private static String[] camelToSnake(String[] arr) {
        StringBuilder str = new StringBuilder();
        char[] ch;
        for (int i = 0; i < arr.length; i++) {

            ch = arr[i].toCharArray();
            for (char c : ch
            ) {
                if (Character.isLetter(c) && Character.isUpperCase(c)) {
                    str.append("_").append(Character.toLowerCase(c));
                } else str.append(c);
            }
            arr[i] = str.toString();
            str.setLength(0);
        }
        System.out.println();
        Arrays.stream(arr).forEach(s -> System.out.print(s+" "));
        return arr;
    }
}
