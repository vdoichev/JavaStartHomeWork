package Lesson14;

public class Loops {

    static void Time(){
        OUTER: for (int i = 0; i < 24; i++){
            if ( i == 6) break ;
            INNER1: for (int j = 0; j < 60; j++){
                if (i > 1 && j%10==0) continue;
                INNER2: for (int k = 0; k < 60; k++){
                    System.out.println(i+":"+j+":"+k);
                    if ((k * i) > j) break ;
                }
            }

        }
    }

    public static void main(String[] args) {
        Time();
    }
}
