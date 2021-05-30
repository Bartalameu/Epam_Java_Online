package Level_One.Branching.fourth;

public class Hole {
    public static void main(String[] args) {
        Brick brick = new Brick(10, 5, 7);
        boolean fit = FitOrNot(4, 6, brick);

        System.out.println("The brick is fit - " + fit);
    }

    public static boolean FitOrNot(int a, int b, Brick brick) {
        return a >= brick.getX() && b >= brick.getY() ||
                a >= brick.getY() && b >= brick.getX() ||
                a >= brick.getX() && b >= brick.getZ() ||
                a >= brick.getZ() && b >= brick.getX() ||
                a >= brick.getY() && b >= brick.getZ() ||
                a >= brick.getZ() && b >= brick.getY();

    }
}
