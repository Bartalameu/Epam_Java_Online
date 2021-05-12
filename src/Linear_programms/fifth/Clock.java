package Linear_programms.fifth;

public class Clock {
    private int input;

    Clock(int input) {
        this.input = input;
    }

    @Override
    public String toString() {
        String format = Integer.toString(input);
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < format.length(); i++) {
           char ch= format.charAt(i);
           sb.append(ch);
            if (i == 1) {
             sb.append("ч ");
            }
            if (i==3){
                sb.append("мин ");
            }
            if (i==5){
                sb.append("c ");
            }
        }
        return  sb.toString();
    }
}
