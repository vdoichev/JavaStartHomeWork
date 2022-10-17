package Lesson24;

public class Pingvin extends Bird implements Speakable{
    Pingvin(String name){
        super(name);
        this.name = name;
    }

    public void eat(){
        System.out.println("Pingvin liubit est ribu");
    }

    public void sleep(){
        System.out.println("Pingvini spiat prijavshis drug k drugu!");
    }

    public void fly(){
        System.out.println("Pingvin ne umeet letat!");
    }

    public void speak(){
        System.out.println("Pingvin ne umeet pet kak solovyi");
    }
}
