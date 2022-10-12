package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        BankAccoun ba = new BankAccoun(1, 10226.34);
        System.out.println(ba.balance);
        ba.popolnenieScheta(546.12);
        System.out.println(ba.balance);
        ba.snyatieScheta(1000.00);
        System.out.println(ba.balance);
    }
}

class BankAccoun{
    BankAccoun(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

    void popolnenieScheta(double sum1){
        balance+=sum1;
    }
    void snyatieScheta(double sum2){
        balance-=sum2;
    }
}

class EmploeeTest{
    public static void main(String[] args) {
        Emploee emploee1 = new Emploee(1,"Doichev V.I.",36,
                36000.00,"Programming");
        Emploee emploee2 = new Emploee(2,"Smokov S.I.",34,
                23000.00,"Programming");
        System.out.println("Salary of "+emploee1.surname+" = "+emploee1.salary);
        System.out.println("Salary of "+emploee2.surname+" = "+emploee2.salary);
        System.out.println("After up to salary:");
        emploee1.upSalary();
        emploee2.upSalary();
        System.out.println("Salary of "+emploee1.surname+" = "+emploee1.salary);
        System.out.println("Salary of "+emploee2.surname+" = "+emploee2.salary);
    }
}

class Emploee {
    Emploee(int id1, String surname1, int age1, double salary1, String departament1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        departament = departament1;
    }

    int id;
    String surname;
    int age;
    double salary;
    String departament;

    void upSalary(){
        salary*=2;
    }
}
