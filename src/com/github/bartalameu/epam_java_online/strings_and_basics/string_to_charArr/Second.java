package com.github.bartalameu.epam_java_online.strings_and_basics.string_to_charArr;

public class Second {
    public static void main(String[] args) {
        System.out.println("Change \"word\" to \"letter\"\n ");
        String word = """
                He keeps his word. I give you my word.
                Can I have a word with you?
                \s""";
        System.out.println(word);
        String letter = word.replaceAll("(word)", "letter");
        System.out.println(letter);

    }
}
