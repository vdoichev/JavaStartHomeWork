package Lesson24;

public class Lev extends Mammal{
    public Lev(String name){
        super(name);
        this.name = name;
    }

    public void eat(){
        System.out.println("Lev, kak liuboy xishnik, lyubit mjaso!");
    }

    public void sleep(){
        System.out.println("Bolshuyu chast dnja lev spit");
    }

    public void run(){
        System.out.println("Lev - eto ne samaja bistraja koshka!");
    }
}
