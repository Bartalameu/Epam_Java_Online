package com.github.bartalameu.epam_java_online.algorithmization.decomposition;

public class Eleventh {
    public static void main(String[] args) {
        int a = 123456;
        int b = 1112222333;
        int one = check_class_int(a);
        int two = check_class_int(b);
        int flag;
        if (one > two) {
            flag = 1;
        } else flag = 0;
        switch (flag) {
            case 1:
                System.out.println("The value a= " + a + " has " + one + "digits" + " that`s more then b= " + b
                        + "which has the " + two + " digits");
            case 0:
                System.out.println("The value a=" + a + " has " + one + " digits" + " that`s less then b=" + b
                        + " which has the " + two + " digits");
        }

    }

    private static int check_class_int(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }
}
