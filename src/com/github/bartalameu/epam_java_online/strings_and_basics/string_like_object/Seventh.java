package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

public class Seventh {
    public static void main(String[] args) {
        String exmpl = "abc cde def";
        System.out.println(deleteRepeatingSymbols(exmpl));
    }

    private static String deleteRepeatingSymbols(String exmpl) {
        StringBuilder single = new StringBuilder();
        for (int i = 0; i < exmpl.length(); i++) {
            if (!single.toString().contains(exmpl.subSequence(i, i + 1))) single.append(exmpl.subSequence(i, i + 1));
        }
        return single.toString().replaceAll("\\s", "");
    }

}