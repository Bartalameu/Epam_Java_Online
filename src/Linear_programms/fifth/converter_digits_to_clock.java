package Linear_programms.fifth;

import java.util.Scanner;

public class converter_digits_to_clock {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Clock time = new Clock(scanner.nextInt());
        System.out.println( time);


    }
}
