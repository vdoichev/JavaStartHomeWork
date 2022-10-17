package Lesson24;

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name = name;
    }

    abstract void run();

    public void speak(){
        //System.out.println(name+" sings");
    }
 }
