package com.github.bartalameu.epam_java_online.basics_of_software_code_development.linear_programms.one_two_three;

public class SecondFunction {
    private double  a,b,c;
    private double ans;
    public SecondFunction(double a, double b, double c){
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
