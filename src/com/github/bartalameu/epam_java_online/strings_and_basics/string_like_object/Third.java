package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

public class Third {
    public static void main(String[] args) {
        String pal = "deified";
        System.out.println("Does the word " + pal + " is palindrome?") ;

        System.out.println(checkIfPalindrome(pal));
    }

    private static boolean checkIfPalindrome(String pal) {
        char[] ch = pal.toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev.append(ch[i]);
    }
        return pal.equals(rev.toString());
    }
}
