package Lesson24;

public abstract class Fish extends Animal{

    public Fish(String name){
        super(name);
        this.name = name;
    }

    public void sleep(){
        System.out.println("Vsegda interesno nabludat, kak spat ribi");
    }

    public abstract void swim();
}
