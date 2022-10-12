package Lesson11;

public class CarTest {

    private static void changeCarDoors(Car car, int count){
        car.countDoors = count;
    }

    private static void changeColors(Car car1, Car car2){
        Car car = new Car();
        car.setColor(car1.color);
        car1.setColor(car2.color);
        car2.setColor(car.color);
    }

    public static void main(String[] args) {
        Car car = new Car("red", "v6", 5);
        System.out.println("car1 - "+car.color +" "+ car.engine +" " + car.countDoors);
        changeCarDoors(car, 3);
        System.out.println("car1 - "+car.color +" "+ car.engine +" " + car.countDoors);
        Car car2 = new Car("yellow", "v5", 4);
        System.out.println("car2 - "+car2.color +" "+ car2.engine +" " + car2.countDoors);
        changeColors(car,car2);
        System.out.println("car1 - "+car.color +" "+ car.engine +" " + car.countDoors);
        System.out.println("car2 - "+car2.color +" "+ car2.engine +" " + car2.countDoors);
    }
}
