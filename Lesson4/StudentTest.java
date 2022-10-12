package Lesson4;

public class StudentTest {

    static void avg(Student student){
        System.out.println(student.firstName+' '+student.lastName+" - " + (student.math + student.economic +student.lang) / 3);
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.ticketNumber = 1;
        st1.firstName = "Ivan";
        st1.lastName = "Ivanov";
        st1.math = 9;
        st1.economic=10;
        st1.lang=6;

        Student st2 = new Student(2,"Petr","Petrov",2022,12,7,8);

        Student st3 = new Student(3,"Oleg","Pushkin",2022);
        st3.math = 5;
        st3.economic=10;
        st3.lang=7;

        //double avg;

        System.out.println("Середні оцінки студентів 2020 року випуску:");
        /*
        //avg = (st1.math + st1.economic +st1.lang) / 3;
        //System.out.println(st1.firstName+' '+st1.lastName+" - " +avg);
        //avg = (st2.math + st2.economic +st2.lang) / 3;
        //System.out.println(st2.firstName+' '+st2.lastName+" - " +avg);
        //avg = (st3.math + st3.economic +st3.lang) / 3;
        //System.out.println(st3.firstName+' '+st3.lastName+" - " +avg);
         */
        avg(st1);
        avg(st2);
        avg(st3);
    }
}

class Student {
    Student(int ticketNumber1,
            String firstName1,
            String lastName1,
            int studyYear1,
            int math1,
            int economic1,
            int lang1){
        ticketNumber = ticketNumber1;
        firstName = firstName1;
        lastName = lastName1;
        studyYear = studyYear1;
        math = math1;
        economic = economic1;
        lang = lang1;
    }

    Student(int ticketNumber2,
            String firstName2,
            String lastName2,
            int studyYear2){
        this(ticketNumber2,firstName2,lastName2,studyYear2,0,0,0);
    }

    Student(){
        this(0,null,null,0,0,0,0);
    }
    int ticketNumber;
    String firstName, lastName;
    int studyYear;
    int math, economic, lang;
}
