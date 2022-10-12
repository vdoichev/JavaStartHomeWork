package Lesson7;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(18);
        employee1.outId();
        Employee employee2 = new Employee("Doichev");
        employee2.outSurname();
        //Employee employee3 = new Employee(2567.23);
        //employee3.outSalary();
    }
}
