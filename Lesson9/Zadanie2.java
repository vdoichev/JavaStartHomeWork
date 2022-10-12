package Lesson9;

import java.util.SortedMap;

 class Zadanie2 {
    int a =1;
    static int b=2;

    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Zadanie2.b);
    }

    public static void main(String[] args) {
        Zadanie2 t = new Zadanie2();
        t.abc(4);
    }

}
