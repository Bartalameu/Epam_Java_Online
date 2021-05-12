package Linear_programms.one_two_three;

public class third_function {
    private double x,y ;
    private double ans;
    public third_function(double x, double y){
        this.x=x;
        this.y=y;

    }
//Ansewer is in Radian
    public double calcul_func() {
        double z= ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);

        return ans=z;

    }

    @Override
    public String toString() {
        return "Answer for third equetion="+ans;
    }
}

