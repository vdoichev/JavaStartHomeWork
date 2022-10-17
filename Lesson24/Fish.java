package Lesson24;

abstract class Fish extends Animal{

    Fish(String name){
        super(name);
        this.name = name;
    }

    void sleep(){
        System.out.println("Vsegda interesno nabludat, kak spat ribi");
    }

    public abstract void swim();
}
