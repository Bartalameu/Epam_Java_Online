package com.github.bartalameu.epam_java_online.strings_and_basics.regular_expr;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        String exmpl = """
                                
                Both versions convey a topic ; It’s pretty easy to predict that the paragraph will be about epidemiological evidence , but only the second version establishes an argumentative point and puts it in context .
                                
                A last thing to note about key sentences is that academic readers expect them to be at the beginning of the paragraph .\040
                              
                Knowing this convention of academic writing can help you both read and write more effectively .
                                
                """;
        System.out.println(exmpl);

        TextProcessor processor = new TextProcessor(exmpl);
        processor.runTerminal();
    }


}

class TextProcessor {
    private final String txt;

    private LinkedList<String> arr;

    TextProcessor(String txt) {
        this.txt = txt;
    }

    public void runTerminal() {
        String guide = ("""
                                
                #############################################################################################################################
                At this program you can do 3 type of manipulation with text:\040
                1) Sorting paragraphs by number sentences.
                2) Sorting words in an every sentence in length.
                3) Sorting lexeme in a sentence  by descending order of the number of occurrences of a given symbol, and in case of equality\040
                - by Alphabet.
                                             
                Enter from 1 to 3 which type of sorting you prefer:
                                
                Or input 4 if you want to close the application.
                #############################################################################################################################
                                
                """);
        System.out.println(guide);
        int inputed = input();
//        int inputed = 1;
        switch (inputed) {
            case 1 -> arr = sortingParagraphs(txt);
            case 2 -> arr = sortingWordsInSentences(txt);
            case 3 -> arr = sortingLexeme(txt);
            case 4 -> {
                System.out.println("************************** Buy :) **********************************");
                System.exit(1);
            }

        }
        if (arr != null) {
            arr.forEach(System.out::println);
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!! Wrong input, try it again, input should be from 1 to 3. !!!!!!!!!!!!!!!!!!!!\n "
            );
            runTerminal();
        }
        runTerminal();
    }

    private int input() {
        int input;
        try {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            if (input >= 1 && input <= 4) return input;
        } catch (InputMismatchException ex) {
            System.out.println("<<<<<<<<<<<Was typed wrong type of argument. Please, input only integer.>>>>>>>>>>>\n");
            runTerminal();
        }
        return 0;
    }

    private LinkedList<String> sortingParagraphs(String txt) {
        LinkedList<String> paragraphs = paragraphToArray(txt);
        int[] arr = new int[paragraphs.size() - 1];
        String regex = "\\b\\S+\\b";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i < paragraphs.size(); i++) {
            int count = 0;
            String par = paragraphs.get(i);
            Matcher matcher = pattern.matcher(par);
            while (matcher.find()) count++;
            arr[i - 1] = count;
        }
        //using bubble sorting for swapping paragraphs
        String txt_temp;
        int digit_temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {

                    txt_temp = paragraphs.get(j);
                    paragraphs.set(j, paragraphs.get(j + 1));
                    paragraphs.set(j + 1, txt_temp);

                    digit_temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = digit_temp;
                }
            }
        }
        System.out.println("================ Result of sorting paragraphs ================ \n");
        return paragraphs;
    }


    private LinkedList<String> sortingWordsInSentences(String txt) {

        String reg_sentence = ".+[.?!;]";
        LinkedList<String> sequences = new LinkedList<>();
        Pattern pattern = Pattern.compile(reg_sentence);
        Matcher matcher = pattern.matcher(txt);
        while (matcher.find()) sequences.add(matcher.group());

        StringBuilder bld = new StringBuilder();

        String[] arr;
        for (int i = 0; i < sequences.size(); i++) {
            arr = sequences.get(i).split(" ");
            for (int j = 0; j < arr.length; j++) {
                for (int k = 1; k < arr.length - j; k++) {
                    if (arr[k - 1].length() > arr[k].length()) {
                        String temp = arr[k - 1];
                        arr[k - 1] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
            for (String x:arr
                 ) {
                String reg ="[.,!;?-]";
                 pattern = Pattern.compile(reg);
                 matcher = pattern.matcher(x);
                 if (!matcher.find()) bld.append(x).append(" ");
            }
            sequences.set(i,bld.toString());
            bld.setLength(0);

        }


        return sequences;

    }

    private LinkedList<String> sortingLexeme(String txt) {
        LinkedList<String> lexemes = new LinkedList<>();

        return lexemes;

    }

    private int countChars(String[] arr) {

        return 0;
    }

    private LinkedList<String> paragraphToArray(String txt) {
        StringBuilder builder = new StringBuilder();
        LinkedList<String> arrayList = new LinkedList<>();
        Scanner sc = new Scanner(txt);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.trim().length() != 0) builder.append(s);
            else {
                arrayList.add(builder.toString());
                builder.setLength(0);
            }
        }
        if (builder.length() != 0) arrayList.add(builder.toString());


        return arrayList;
    }


}