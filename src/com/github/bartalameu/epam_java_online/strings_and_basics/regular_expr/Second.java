package com.github.bartalameu.epam_java_online.strings_and_basics.regular_expr;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) {
        String html = """
                <notes>
                <note id = "1">
                <to>Вася</to>
                <from>Света</from>
                <heading>Напоминание</heading>
                <body>Позвони мне завтра!</body>
                </note>
                <note id = "2">
                <to>Петя</to>
                <from>Маша</from>
                <heading>Важное напоминание</heading>
                <body/>
                </note>
                </notes>""";
        parser(html);

    }


    private static void parser(String x) {
        System.out.println("**************Start parsing the page : **************\n" + x + "\n");
        String reg_start = "<\\w+[^>]*>";
        String tag_start;
        String tag_end;
        Pattern start = Pattern.compile(reg_start);

        Matcher matcher_start = start.matcher(x);
        while (matcher_start.find()) {
            String tag = getTag(matcher_start.group().substring(1, matcher_start.group().length() - 1));

            tag_start = "(?:<" + tag + "\\b[^>]*?>)+?";
            tag_end = "(?:</" + tag + ">)+?";

            String reg = tag_start + "([\\s\\S]*?)" + tag_end;

            Pattern pattern_reg = Pattern.compile(reg);
            Matcher matcher_reg = pattern_reg.matcher(x);

            Pattern pattern_start = Pattern.compile(tag_start);
            Pattern pattern_end = Pattern.compile(tag_end);

            Matcher matcher_tag_start = pattern_start.matcher(x);
            Matcher matcher_tag_end = pattern_end.matcher(x);
//            System.out.println("_________________Text before if statements_____________\n"+x);
            if (matcher_reg.find() && matcher_tag_start.find() && matcher_tag_end.find()) {
                strings.add("\n++++++++Start of node = " + matcher_tag_start.group() + "\n" + matcher_reg.group(1)
                        + "\n--------End of node = " + matcher_tag_end.group());


                int first = x.indexOf(matcher_tag_start.group());
                int word = first + matcher_tag_start.group().length();
                x = deleteTags(x, first, word);

                int second = x.indexOf(matcher_tag_end.group());
                word = second + matcher_tag_end.group().length();
                x = deleteTags(x, second, word);

            }
            if (matcher_tag_start.find() && !matcher_tag_end.find()) {
                int first = x.indexOf(matcher_tag_start.group());
                int word = first + matcher_tag_start.group().length();
                x = deleteTags(x, first, word);
                System.out.println("WARNING THIS TAG WITHOUT BODY : " + tag);
                continue;
            }

            if (!matcher_tag_start.find() && matcher_tag_end.find()) {
                int second = x.indexOf(matcher_tag_end.group());
                int word = second + matcher_tag_end.group().length();
                x = deleteTags(x, second, word);
                System.out.println("WARNING THIS TAG WITHOUT BODY : " + tag);
            }


        }

        strings.forEach(s -> System.out.println(s + "\n"));

    }


    private static String deleteTags(String x, int start, int end) {

        StringBuilder builder = new StringBuilder(x);
        builder.delete(start, end);
        return builder.toString();
    }

    private static String getTag(String tag) {
        StringBuilder builder = new StringBuilder();
        char[] chars = tag.toCharArray();
        for (char ch :
                chars) {
            if (Character.isLetter(ch)) builder.append(ch);
            else break;
        }
        return builder.toString();
    }


}