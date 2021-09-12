package com.github.bartalameu.epam_java_online.strings_and_basics.string_to_charArr;

public class Fifth {
    public static void main(String[] args) {

        String s = "   There is too        much    spaces      ";
        System.out.println("Before deleting spaces: \n " + s);
        System.out.println("After deleting: ");
        System.out.println(deleteSpaces(s));
    }

    private static String deleteSpaces(String s) {
        char[] sp = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sp.length; i++) {
            if (sp[i] != ' ') res.append(sp[i]);
            if (i + 1 != sp.length && sp[i] == ' ' && sp[i + 1] != ' ') res.append(" ");
        }
        if (sp[0] == ' ') res.delete(0, 1);
        if (sp[sp.length - 1] == ' ') res.delete(res.length(), res.length());

        return res.toString();
    }

}
