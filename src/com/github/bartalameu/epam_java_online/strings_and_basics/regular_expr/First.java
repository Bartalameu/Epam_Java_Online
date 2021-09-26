package com.github.bartalameu.epam_java_online.strings_and_basics.regular_expr;


import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        String exmpl = """
                My name is Clark, and I will tell you about my city.

                I live in an apartment. In my city, there is a post office where people mail letters. On Monday, I go to work. I work at the post office. Everyone shops for food at the grocery store. They also eat at the restaurant. The restaurant serves pizza and ice cream.

                My friends and I go to the park. We like to play soccer at the park. On Fridays, we go to the cinema to see a movie. Children don't go to school on the weekend. Each day, people go to the hospital when they are sick. The doctors and nurses take care of them. The police keep everyone safe. I am happy to live in my city.""";
        System.out.println(exmpl);

        TextProcessor processor = new TextProcessor(exmpl);
        processor.runTerminal();
    }


}

class TextProcessor {
    private final String txt;

    private LinkedList<String> arr = new LinkedList<>();

    TextProcessor(String txt) {
        this.txt = txt;
    }

    public void runTerminal() {
        if (txt.length() > 0) {
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
                    Enter:\040""");
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
            if (!arr.isEmpty()) {
                arr.forEach(System.out::println);
                arr.clear();
            } else {
                System.out.println("!!!!!!!!!!!!!!!!!!!! Wrong input, try it again, input should be from 1 to 3. !!!!!!!!!!!!!!!!!!!!\n "
                );
                runTerminal();
            }
            runTerminal();
        } else {
            System.out.println("Sorry but program hasn't source for working :( ");
            System.exit(0);
        }
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
        LinkedList<String> temp = getSequences(txt);
        String[] arr;
        StringBuilder builder = new StringBuilder();
        LinkedList<String> sequences = new LinkedList<>();
        for (String s : temp) {
            arr = splitSequenceToWords(s).split(" ");
            for (int j = 0; j < arr.length; j++) {
                for (int k = 1; k < arr.length - j; k++) {
                    if (arr[k - 1].length() > arr[k].length()) {
                        String x = arr[k - 1];
                        arr[k - 1] = arr[k];
                        arr[k] = x;
                    }
                }
            }
            for (String x : arr
            ) {
                builder.append(x).append(" ");
            }
            sequences.add(builder.toString());
            builder.setLength(0);

        }
        return sequences;
    }

    private LinkedList<String> sortingLexeme(String txt) {
        LinkedList<String> lexemes = new LinkedList<>();
        String[] words;
        Scanner scan_char = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        System.out.println("Enter the alphabet character for sorting lexeme by this char: ");
        String input = scan_char.nextLine();
        //First , add the sentences for working with words.
        if (Character.isLetter(input.charAt(0)) && input.length() == 1) {

            lexemes = getSequences(txt);

            for (String lexeme : lexemes) {

                words = splitSequenceToWords(lexeme).split(" ");

                for (int j = 0; j < words.length; j++) {
                    for (int k = 1; k < words.length - j; k++) {
                        String left = words[k - 1];
                        String right = words[k];
                        long one = left.chars().filter(value -> value == input.charAt(0)).count();
                        long two = right.chars().filter(value -> value == input.charAt(0)).count();
                        if (one < two) {
                            String x = words[k - 1];
                            words[k - 1] = words[k];
                            words[k] = x;
                        }
                        if (one == two && one != 0) {
                            if (Character.toLowerCase(left.charAt(0)) > Character.toLowerCase(right.charAt(0))) {
                                String x = words[k - 1];
                                words[k - 1] = words[k];
                                words[k] = x;
                            }


                        }
                    }


                }
                for (String word : words
                ) {
                    builder.append(word).append(" ");
                }
                lexemes.set(lexemes.indexOf(lexeme), builder.toString());
                builder.setLength(0);
            }

        } else {
            System.out.println("You can Enter only char variable, please, try again :)");
        }
        return lexemes;
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

    private LinkedList<String> getSequences(String txt) {
        String reg_sentence = "\\w+[^.!?]*[.!?]";
        LinkedList<String> sequences = new LinkedList<>();
        Pattern pattern = Pattern.compile(reg_sentence);
        Matcher matcher = pattern.matcher(txt);
        while (matcher.find()) sequences.add(matcher.group());
        return sequences;
    }

    //Returned the Sting array without punctuation
    private String splitSequenceToWords(String sequences) {
        String reg = "[.,!;?]$";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher;
        boolean finder;
        StringBuilder bld = new StringBuilder();
        String[] arr;
        arr = sequences.split(" ");
        for (String x : arr
        ) {
            matcher = pattern.matcher(x);
            finder = matcher.find();
            if (!finder) bld.append(x).append(" ");
            else {
                bld.append(x, 0, x.length() - 1).append(" ");
            }
        }

        return bld.toString();
    }


}