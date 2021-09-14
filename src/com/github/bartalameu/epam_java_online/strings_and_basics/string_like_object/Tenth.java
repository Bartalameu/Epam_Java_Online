package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

public class Tenth {
    public static void main(String[] args) {
        String l_txt = """
                Philippine Airlines has problems with money. The airline files for bankruptcy on Monday. Bankruptcy means that the company cannot pay its debts.
                The problems start during the coronavirus. People cannot travel? Airlines do not make money!
                Philippine Airlines has a plan. The plan will solve the company´s problems. The airline will return 22 planes which it leases from other companies?""";
        int sequence_count = 0;
        for (int i = 0; i < l_txt.length(); i++) {
            if (l_txt.charAt(i) == '?' || l_txt.charAt(i) == '!' || l_txt.charAt(i) == '.') sequence_count++;
        }
        System.out.println("In text :\n\n"+l_txt+ "\n\nNumber of sequences are + "+sequence_count );
    }


}
