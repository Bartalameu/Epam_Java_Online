package com.github.bartalameu.epam_java_online.level_one.branching.first;

public class Triangle {
     double angle_1;
     double angle_2;
     double angle_3;


     Triangle (double angle_1,double angle_2) {
         this.angle_1 =angle_1;
         this.angle_2=angle_2;
         this.angle_3=180-(angle_1+angle_2);
     }
     public boolean testing_existence (Triangle triangle) {
         double sum_grade=triangle.angle_1+triangle.angle_2+ triangle.angle_3;
         return sum_grade <= 180 && triangle.angle_3 > 0;

     }

}
