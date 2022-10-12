package Lesson15;

public class Loops {

    private static void Time(){
        int hour = 0;

        OUTER:
        while (hour<6){
            int minute = 0;
            MIDDLE:
            while (minute<60){
                if (hour>1 && minute % 10 == 0) break OUTER;

                int second = 0;
                INNER:
                do {
                    if ((hour * second) > minute ) break INNER;
                    System.out.println(hour+":"+minute+":"+second);
                    second++;
                }
                while (second<60);
                minute++;
            }
            hour++;
        }
    }
    public static void main(String[] args) {
        Time();
    }
}
