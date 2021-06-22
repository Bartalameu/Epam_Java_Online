package Level_One.Loops;

public class second {
    public static void main(String[] args) {

        int a = 2;
        int b =16;
        int h = 2;
        calc_func(a,b,h);
    }
    private static void calc_func ( int a ,int b , int h) {
        int y;
        for (int i = a; i<=b ; i+=h) {

            if ( i > 2  ) {
                y = i;
                System.out.println(" y for "+ i +" = "+y);
            }if ( i<=2) {
                y= i*(-1);
                System.out.println(" y for "+ i +" = "+y);
            }

        }

    }
}
