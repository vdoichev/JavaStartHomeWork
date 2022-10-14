package Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public Student(StringBuilder name, int course, int grade) {
        this.setName(name);
        this.setCourse(course);
        this.setGrade(grade);
    }

    public void showInfo(){
        System.out.println(this.getName()+" "+this.getCourse()+" "+this.getGrade());
    }

    private StringBuilder getName() {
        return name;
    }

    private int getCourse() {
        return course;
    }

    private int getGrade() {
        return grade;
    }

    private void setName(StringBuilder name) {
        if (name.length()>=3)
            this.name = name;
    }

    private void setCourse(int course) {
        if (course>0 && course<5)
            this.course = course;
    }

    private void setGrade(int grade) {
        if (grade>0 && grade<11)
            this.grade = grade;
    }
}
