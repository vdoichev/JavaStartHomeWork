package Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Kolia");
        System.out.println("Mechenosec "+mechenosec.name);
        mechenosec.eat();
        mechenosec.sleep();
        mechenosec.swim();

        System.out.println("-----------------------------------");
        Speakable pingvin = new Pingvin("Din");
        pingvin.speak();

        System.out.println("-----------------------------------");
        Animal lev = new Lev("Lion");
        System.out.println("Lev "+lev.name);
        lev.eat();
        lev.sleep();

        System.out.println("-----------------------------------");
        Mammal lev1 = new Lev("Simba");
        System.out.println("Lev "+lev1.name);
        lev1.eat();
        lev1.sleep();
        lev1.run();
        lev1.speak();
    }
}
