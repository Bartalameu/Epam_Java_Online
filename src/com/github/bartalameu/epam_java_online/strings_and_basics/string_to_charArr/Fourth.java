package com.github.bartalameu.epam_java_online.strings_and_basics.string_to_charArr;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fourth {
    public static void main(String[] args) {
        String s = " One two three 45 six 75 56";
        System.out.println("At sequence : "+ s);

        System.out.println(findNumAtString(s)+ " characters which are numbers.");
    }

    private  static int findNumAtString( String s ) {
        char [] ch = s.toCharArray();
        int count=0;
        for (int i = 0; i <ch.length ; i++) {
            if ( i+1<=ch.length-1){
                if (Character.isDigit(ch[i])&&Character.isDigit(ch[i+1])) count++;
            }
        }
        return count;
    }
}
