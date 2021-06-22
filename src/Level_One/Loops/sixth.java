package Level_One.Loops;

public class sixth {
    public static void main(String[] args) {

        for (int i = 32; i<=122; i++) {
            char ch = (char) i;
            if (ch == ' '){
                System.out.println(i+"= " + "SPACE");
            }else
            System.out.println(i+"= " + ch);
        }

    }
}
