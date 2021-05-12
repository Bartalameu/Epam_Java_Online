package Linear_programms.one_two_three;

import java.util.Scanner;

/*

*/
public class calculator_of_functions {
    public static void main(String[] args) {

        String first_equation = "1) z=((a-3)*b/2)+c";
        String second_equation = "2) (b+sqrt(b^2+4*a*c))/2*a - a^3*c+b^-2";
        String third_equation = "3) (sin(x)+cos(y)/cos(x)-sin(y)) * tg(xy) ";
        System.out.println("This program has three variants of equations :" +
                "\n" + first_equation + "\n" + second_equation + "\n" + third_equation);
        System.out.println("Make choose between 1-3  for calculation :  ");

        int choosen = choose_case();
        System.out.println("You choosed number : " + choosen);
       String answer= swither(choosen);
        System.out.println(answer);



    }


    private static int choose_case() {
        int choose ;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {

            if (sc.hasNextInt()) {
                choose = sc.nextInt();
                if (choose < 4 && choose > 0) {
                    return choose;
                }
            }
            System.out.println("Tiped wrong symbol, enter digit between 1-3");
            sc.nextLine();

        }
        return 0;
    }

    public static String swither(int choosen) {

        return switch (choosen) {
            case (1) -> first_equation();
            case (2) -> second_equation();
            case (3) -> third_equation();
            default -> "Somethig gone wrong";
        };
    }

    public static String first_equation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values for equetion:");
        System.out.println("a=");
        double a = scan.nextDouble();
        System.out.println("b=");
        double b = scan.nextDouble();
        System.out.println("c=");
        double c = scan.nextDouble();
        scan.close();
        first_function first = new first_function(a, b, c);
        first.calcul_func();
        return first.toString();
    }

    public static String second_equation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for equetion:");
        System.out.println("a=");
        double a = sc.nextDouble();
        System.out.println("b=");
        double b = sc.nextDouble();
        System.out.println("c=");
        double c = sc.nextDouble();
        sc.close();
        second_function second = new second_function(a, b, c);
        second.calcul_func();
        return second.toString();
    }

    public static String third_equation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for equetion:");
        System.out.println("x=");
        double x = sc.nextDouble();
        System.out.println("y=");
        double y = sc.nextDouble();
        sc.close();
        third_function third = new third_function(x, y);
        third.calcul_func();
        return third.toString();
    }
}