package Lesson24;

public abstract class Bird extends Animal implements Speakable{
    public Bird(String name){
        super(name);
        this.name = name;
    }

    public abstract void fly();

    public void speak(){
        System.out.println(name+" sings");
    }
}
