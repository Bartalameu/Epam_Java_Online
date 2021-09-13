package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;


public class Fifth {
    public static void main(String[] args) {
        String a = "Abracadabra";
        System.out.println("Word "+ a +" has "+ countA(a)+ " letter (a)");
    }

    private static int countA(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if ( a.charAt(i)=='a') count++;
        }

        return count;
    }
}
