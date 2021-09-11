package com.github.bartalameu.epam_java_online.strings_and_basics.string_to_charArr;

import java.util.stream.IntStream;


public class Third {
    public static void main(String[] args) {

        String s = " One two three 4 5 six 7";
        System.out.println("At sequence : "+ s);
        IntStream chars= s.chars();
        int n = (int) chars.mapToObj(value -> (char)value).filter(Character::isDigit).count();

        System.out.println(n+ " characters which are digits.");
    }
}