package Lesson8;

public class Lesson8 {
    static final double PI = 3.14;
    static int method1(int a, int b, int c){
        return a * b * c;
    }

    static void method2(int x, int z){
        System.out.println("celoe - "+x/z+ ", Ostatok - "+x%z);
    }

    public double circleArea(int radius){
        double result = PI * radius * radius;
        return result;
    }

    public static double circle(int radius){
        return PI * 2 * radius;
    }

    public void info(int radius){
        System.out.println("Radius - "+radius+", " +
                           "Circle Area - "+circleArea(radius)+
                           ", Okrugnost - "+circle(radius) );
    }




}
