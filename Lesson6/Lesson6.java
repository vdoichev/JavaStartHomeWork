package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Summa a = new Summa();
        Summa b = new Summa(5);
        Summa c = new Summa(7,8);
        Summa d = new Summa(5,9,13);
        Summa e = new Summa(2,6,3,9);
    }
}

class Summa{
    Summa(){
        this(0,0,0,0);
    }
    Summa(int arg1){
        this(arg1,0,0,0);
    }
    Summa(int arg1, int arg2){
        this(arg1,arg2,0,0);
    }
    Summa(int arg1, int arg2, int arg3){
        this(arg1,arg2,arg3,0);
    }
    Summa(int arg1,int arg2,int arg3,int arg4){
        System.out.println(arg1+arg2+arg3+arg4);
    }
}
