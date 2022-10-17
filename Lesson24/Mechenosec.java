package Lesson24;

public class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim(){
        System.out.println("Mechenosec krasivaja riba, kotoraja bistro plavaet!");
    }

    public void eat(){
        System.out.println("Mechenosec ne xishnaja riba, i ona est obichniy ribiy korm!");
    }
}
