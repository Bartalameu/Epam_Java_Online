package Level_One.Linear_programms.one_two_three;

public class second_function {
    private double  a,b,c;
    private double ans;
    public second_function(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double calcul_func() {
        double z = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a,3)*c+Math.pow(b,-2);

        return ans=z;

    }

    @Override
    public String toString() {
        return "Answer for second equetion="+ans;
    }
}