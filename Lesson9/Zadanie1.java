package Lesson9;

public class Zadanie1 {

    static int count;
    Zadanie1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Zadanie1 a1 = new Zadanie1();
        Zadanie1 a2 = new Zadanie1();
        Zadanie1 a3 = new Zadanie1();
        Zadanie1 a4 = new Zadanie1();
        Zadanie1 a5 = new Zadanie1();
        Zadanie1 a6 = new Zadanie1();
        Zadanie1 a7 = new Zadanie1();
        Zadanie1 a8 = new Zadanie1();
        a8 = null;
        a7=null;
        a6=null;
        a5=null;
        a4=null;
        a3=null;
        a2=null;
        System.out.println(Zadanie1.count);
    }
}
