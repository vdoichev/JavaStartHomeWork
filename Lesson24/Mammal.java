package Lesson24;

public abstract class Mammal extends Animal implements Speakable{
    public Mammal(String name){
        super(name);
        this.name = name;
    }

    public abstract void run();

    public void speak(){
        //System.out.println(name+" sings");
    }
 }
