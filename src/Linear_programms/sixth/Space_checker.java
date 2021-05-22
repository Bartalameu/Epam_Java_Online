package Linear_programms.sixth;

import java.util.ArrayList;
import java.util.Arrays;

public class Space_checker {
    public static void main(String[] args) {
        Point point = new Point(-7, 4);
        System.out.println("Is a point  in  coordinate system ?");
        System.out.println(check(point));

    }

    public static boolean check(Point point) {

        return point.x >= -4 && point.x <= 4 && point.y >= -3 && point.y <= 4;
    }
}
