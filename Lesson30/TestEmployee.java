package Lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {

    void printEmployee(Employee emp){
        System.out.println("Name -> "+emp.name+", Department -> "+emp.department+", Salary -> "+emp.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> emp, Predicate<Employee> pr){
        for (Employee e : emp) {
            if (pr.test(e)){
                printEmployee(e);
            }

        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", "IT", 56000.00);
        Employee emp2 = new Employee("Petr", "BUH", 23000.00);
        Employee emp3 = new Employee("IT", "IT", 46000.00);
        Employee emp4 = new Employee("OLEG", "STATISTICS", 30000.00);
        Employee emp5 = new Employee("MARIYA", "IT", 55000.00);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(emp4);
        arrayList.add(emp5);

        TestEmployee t = new TestEmployee();
        t.filtraciyaRabotnikov(arrayList, emp -> emp.department.equals("IT") && emp.salary>50000);
        System.out.println("--------------------------------");
        t.filtraciyaRabotnikov(arrayList, emp -> emp.name.charAt(0) == 'O' && emp.salary!=50000);
        System.out.println("--------------------------------");
        t.filtraciyaRabotnikov(arrayList, emp -> emp.department.equals(emp.name));
        }
}