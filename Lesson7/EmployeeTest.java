package Lesson7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(18);
        employee1.outId();
        Employee employee2 = new Employee("Doichev");
        employee2.outSurname();
        //Employee employee3 = new Employee(2567.23);
        //employee3.outSalary();

    }
}

class Employee {
    Employee(int id1, String surname1, int age1, double salary1, String departament1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        departament = departament1;
    }

    Employee(int id2){
        this(id2,null,0,0.0,null);
    }

    public Employee(String surname2){
        this(0,surname2,0,0.0,null);
    }

    private Employee(double salary1) {
        this(0, null, 0, salary1, null);
    }
    int id;
    public String surname;
    int age;
    private double salary;
    String departament;

    void upSalary(){
        salary*=2;
    }

    public void outSalary(){
        System.out.println(salary);
    }

    public void outId(){
        System.out.println(id);
    }

    public void outSurname(){
        System.out.println(surname);
    }
}
