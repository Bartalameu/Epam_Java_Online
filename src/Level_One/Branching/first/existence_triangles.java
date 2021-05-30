package Level_One.Branching.first;

public class existence_triangles {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(120, 65);
        boolean check = triangle.testing_existence(triangle);
        System.out.println("The triangle with angles " +
                "\nang_1=" + triangle.angle_1 + "\nang_2=" + triangle.angle_2 + "\nang_3=" + triangle.angle_3
                + "\nexists? " + check);

    }
}
