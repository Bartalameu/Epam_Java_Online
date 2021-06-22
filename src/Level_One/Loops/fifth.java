package Level_One.Loops;

public class fifth {
    public static void main(String[] args) {
        double e = 0.1;

        int end = 5;
        sumOfMembers(e, end);
    }

    private static void sumOfMembers(double e, int end) {

        double sum =0;

        for ( int i =0; i<=end; i++) {

            double a = ((double)1/Math.pow(2,i)) + ((double)1/Math.pow(3,i));
            System.out.println(" a = " + a );
            //Using round double just for better view
            double round = Math.abs(Math.round(a*10.0)/10.0) ;
            System.out.println("round= "+ round);
            if (round>=e){
                sum +=round;
            }
        }
        System.out.println("\nSum = " + sum);

    }
}
