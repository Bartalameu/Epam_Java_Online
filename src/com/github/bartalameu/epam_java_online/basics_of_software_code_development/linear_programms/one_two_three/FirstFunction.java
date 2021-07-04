package com.github.bartalameu.epam_java_online.basics_of_software_code_development.linear_programms.one_two_three;

public class FirstFunction {
    private double a, b, c;
    private double ans;

    public FirstFunction(double a, double b, double c) {
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
