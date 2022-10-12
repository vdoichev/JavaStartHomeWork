package Lesson12;

public class StudentTest {

    static void compareStudents1(Student st1, Student st2){
        if (st1.name == st2.name && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Studenti ravni");
        }
        else {
            System.out.println("Studenti ne ravni");
        }
    }

    static void compareStudents2(Student st1, Student st2){
        if (st1.name == st2.name) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade){
                    System.out.println("Studenti ravni");
                }
                else {
                    System.out.println("Ocenki studentov ne ravni");
                }
            }
            else {
                System.out.println("Cursi studentov ne ravni");
            }
        }
        else {
            System.out.println("Imena studentov ne ravni");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9);
        Student st2 = new Student("Ivan", 3, 9);
        compareStudents1(st1, st2);
        compareStudents2(st1, st2);

    }
}
