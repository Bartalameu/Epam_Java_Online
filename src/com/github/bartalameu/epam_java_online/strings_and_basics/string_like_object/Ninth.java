package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

public class Ninth {
    public static void main(String[] args) {
        String s = "Even the EaRly doctors KneW That washing hands prevents Infection.";
        int lower_case = 0;
        int upper_case = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) upper_case++;
            else if (Character.isLowerCase(s.charAt(i))) lower_case++;
        }
        System.out.println("At the sequence : \n" + s + "\nletters with lower case " + lower_case + " \nletters with upper case " + upper_case);
    }
}
