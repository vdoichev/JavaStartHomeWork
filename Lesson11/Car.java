package Lesson11;

public class Car {
    String color;
    String engine;
    int countDoors;

    public Car(String color, String engine, int countDoors){
        this.color = color;
        this.engine = engine;
        this.countDoors = countDoors;
    }

    Car(){
        this(null,null,0);
    }

    public void setColor(String color){
        this.color = color;
    }
}


