package com.github.bartalameu.epam_java_online.strings_and_basics.string_like_object;

public class Fourth {
    public static void main(String[] args) {
        String from = "информатика";
        String to = "торт";
        System.out.println("Result: "+ createCake(from,to));
    }

    private static String createCake(String from, String to) {
        StringBuilder cake = new StringBuilder();
        char[] ch = from.toCharArray();
        for (int x = 0; x< to.length(); x++) {
            for (int i = 0; i < ch.length; i++) {

                if (ch[i] == 'т' && x==0 ) {
                    System.out.println("Find \"т\" , concatenate... ");
                    cake.append(ch[i]);
                }
                else if (cake.length()>0 && cake.length()< x && i + 1 != ch.length && ch[i] == 'о' && ch[i + 1] == 'р'){
                    System.out.println("Find \"ор\" , copy from char array ... ");
                    cake.append(String.copyValueOf(ch, i, 2));
                }
                else if ( x==to.length()-1 &&ch[i]=='т'){
                    System.out.println("Find \"т\" , concatenate... ");
                    cake.append(ch[i]);
                }

            }
        }

        return cake.toString();
    }
}
