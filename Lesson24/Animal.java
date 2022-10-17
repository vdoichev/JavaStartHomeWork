package Lesson24;

abstract class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}
