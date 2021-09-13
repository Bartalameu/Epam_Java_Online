package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

public class Sixth {
    public static void main(String[] args) {
        String base = "Double letter for every word";
        StringBuilder two_letter = new StringBuilder();
        for (int i = 0; i < base.length(); i++) {
            if (base.charAt(i) != ' ') two_letter.append(base.charAt(i)).append(base.charAt(i));
            else two_letter.append(' ');
        }
        System.out.println(two_letter);
    }
}
