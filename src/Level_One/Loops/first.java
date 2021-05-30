package Level_One.Loops;

import java.util.Scanner;

/*Solution of this case is Fibonacci Series by recursion
but after number 42 , the fibonacci by recursion works very slow ,
and you should wait a little bit for answer
 */

public class first {
    public static void main(String[] args) {
        System.out.println("Input the  positive number for calculations ");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("The sum of all previous digits for "+x +" = "+fibonacci(x));
//        sc.close();
    }

    public static long fibonacci(long x ) {
        if ((x==0)||(x==1))
            return x;
        else
            return fibonacci(x-1)+fibonacci(x-2);
    }
}
