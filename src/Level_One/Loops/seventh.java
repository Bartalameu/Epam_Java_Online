package Level_One.Loops;



import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input start of range= ");
        int start = sc.nextInt();
        System.out.println("Input end of  range= ");
        int n = sc.nextInt();
        divided(start, n);
    }

    private static void divided(int start, int end) {

        for (int i = start; i <= end; i++) {
            int count = i;
            while (count>0) {
                int next = count;
                if (i != 1 && next != 1 &&next!=i) {

                        int div = i % next;
                        if (div == 0) {
                            System.out.println(" divided for i= " + i + " is " + next);
                        }
                }
                count--;


            }
        }

    }

}
