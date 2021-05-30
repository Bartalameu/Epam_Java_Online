package Level_One.Linear_programms.one_two_three;

public class first_function {
    private double a, b, c;
    private double ans;

    public first_function(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcul_func() {
        double z = ((a-3)*b/2)+c;

        return ans = z;

    }

    @Override
    public String toString() {
        return "Answer for first equetion=" + ans;
    }
}
