package Lesson25;
import Lesson24.*;
public class Lesson25 {
    public static void main(String[] args) {
        Animal lev1 = new Mechenosec("Simba");
        Animal lev2 = new Pingvin("Simba2");
        Animal lev3 = new Lev("Simba3");
        Fish fish1 = new Mechenosec("Fred");
        Bird bird1 = new Pingvin("PinPin");

        Animal[] animals = new Animal[]{lev1,lev2,lev3,fish1,bird1};
        Speakable[] speakables = new Speakable[]{bird1};

        System.out.println("-------Search animal---------");
        for (Animal animal: animals) {
            System.out.println("----------------");
            if (animal instanceof Lev){
                System.out.println(((Lev)animal).name);
                ((Lev)animal).run();
                ((Lev)animal).eat();
                ((Lev)animal).sleep();
                ((Lev)animal).speak();
            }else if (animal instanceof Pingvin){
                System.out.println(((Pingvin)animal).name);
                ((Pingvin)animal).fly();
                ((Pingvin)animal).eat();
                ((Pingvin)animal).sleep();
                ((Pingvin)animal).speak();
            }else if (animal instanceof Mechenosec){
                System.out.println(((Mechenosec)animal).name);
                ((Mechenosec)animal).eat();
                ((Mechenosec)animal).sleep();
                ((Mechenosec)animal).swim();
            }
        }

        System.out.println("-------Search speakable---------");
        for (Speakable speakable: speakables) {
            if (speakable instanceof Lev){
                System.out.println(((Lev)speakable).name);
                ((Lev)speakable).run();
                ((Lev)speakable).eat();
                ((Lev)speakable).sleep();
                ((Lev)speakable).speak();
            }else if (speakable instanceof Pingvin) {
                System.out.println(((Pingvin) speakable).name);
                ((Pingvin) speakable).fly();
                ((Pingvin) speakable).eat();
                ((Pingvin) speakable).sleep();
                ((Pingvin) speakable).speak();
            }
        }
    }
}
