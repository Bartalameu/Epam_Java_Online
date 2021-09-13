package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

public class Eighth {
    public static void main(String[] args) {
        String long_words = "palindromes , long , big , congratulations , end";
        int max_lenght = 0;
        int prev = max_lenght;
        for (int i = 0; i < long_words.length(); i++) {
            if (Character.isLetter(long_words.charAt(i))) {
                max_lenght++;
            } else if (Character.isSpaceChar(long_words.charAt(i))) {
                if (prev < max_lenght) prev = max_lenght;
                max_lenght = 0;
            }

        }
        if (prev > max_lenght) System.out.println("The longest word has " + prev + " symbols");
        else System.out.println("The longest word has " + max_lenght + " symbols");
    }
}
