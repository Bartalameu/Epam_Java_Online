package Linear_programms.fifth;

public class Clock {
    private int input;

    Clock(int input) {
        this.input = input;
    }

    public String convert() {
        int h = input / 3600;
        int min = (input % 3600) / 60;
        int sec = input % 3600 % 60;
        return h + "h " + min + "мин " + sec + "с";
    }


}
