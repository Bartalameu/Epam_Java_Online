package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        String sp = " Let`s      Find the         biggest  void     ";
        System.out.println(sp);
        //For illustrative purposes replace space to number of spaces
        int[] max = new int[sp.length()];
        int count = 0;
        StringBuilder b = new StringBuilder(sp);
        for (int i = 0; i < b.length(); i++) {
            if (b.substring(i, i + 1).equals(" ")) {
                b.replace(i, i + 1, Integer.toString(count + 1));
                count++;
            } else if (!b.substring(i, i + 1).equals(" ")) {
                max[i] = count;
                count = 0;
            }

        }
        System.out.println("biggest space is = " + Arrays.stream(max).max().getAsInt());

        System.out.println(b);
    }
}
