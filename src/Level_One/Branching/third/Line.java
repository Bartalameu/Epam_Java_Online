package Level_One.Branching.third;

public class Line {
    public static void main(String[] args) {
        Point p1 = new Point(-3, -3);
        Point p2 = new Point(6, 3);
        Point p3 = new Point(0, -1);
        boolean onLine= checkLine(p1, p2, p3);
        System.out.println("The three points are on line \n"+onLine);
    }

    public static boolean checkLine(Point p1, Point p2, Point p3) {

        /*If left side of equation has equale to right side , this meaning that 3 points are one line
        (x3-x1)/(x2-x1) = (y3-y1)/(y2-y1)
        Epsilon variable i use like treshold for comparison two double value
        * */

        double epsilon = 0.000001d;
        double equationLeft = (p3.getX() - p1.getX()) / (p2.getX() - p1.getX());
        double equationRigh = (p3.getY() - p1.getY()) / (p2.getY() - p1.getY());
        System.out.println("equationLeft= " + equationLeft + "\nequationRight=" + equationRigh);
        return Math.abs(equationLeft - equationRigh) < epsilon;
    }
}
