package Level_One.Loops;

public class fourth {
    public static void main(String[] args) {

        double multiplication = 1;
        int count = 0;
        double num = -3.0;

        while (count <= 200) {
            multiplication *= Math.pow(num,2);
            num += 0.01;
            count++;
        }
        System.out.println("Sum of square  for first 200 numbers = "+ multiplication);
    }
}
