package Lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lesson29 {

    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");

    public static void main(String[] args) {
        LocalDateTime s1 = LocalDateTime.now().minusMonths(12);
        LocalDateTime s2 = LocalDateTime.now();
        Period p = Period.ofMonths(1);
        Duration d = Duration.ofMinutes(1);
        Lesson29 t = new Lesson29();
        t.smena(s1, s2, p, d);
        /*LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1.format(f1));
        System.out.println(ldt1.format(f2));*/
    }

    public void smena(LocalDateTime startDateTime,
                      LocalDateTime stopDateTime,
                      Period p,
                      Duration d){

        LocalDateTime start = startDateTime;
        while (start.isBefore(stopDateTime)){
            System.out.print("Работаем с: "+start.format(f1));
            start = start.plus(p);
            System.out.println("  -  До: "+start.format(f1));
            System.out.print("  Отдыхаем с: "+start.format(f2));
            start = start.plus(d);
            System.out.println("  -  До: "+start.format(f2));
        }

    }
}
