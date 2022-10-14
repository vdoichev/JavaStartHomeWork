package Lesson22;

public class Test{
    public static void main(String[] args) {
        Dog dog = new Dog("Polkan");
        System.out.println("Kol-vo lap u "+dog.name+" - "+dog.paw);
        Cat cat = new Cat("Kitty");
        cat.sleep();
    }
}

class Animal {
    protected int eyes;

    protected Animal() {
        System.out.println("I am animal");
    }

    protected void eat(){
        System.out.println("Animal eats");
    }

    protected void drink(){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{
    String name;
    final int tale = 1;
    final int paw = 4;

    public Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet{

    public Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: "+name);
    }

    public void play(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{

    public Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: "+name);
    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

