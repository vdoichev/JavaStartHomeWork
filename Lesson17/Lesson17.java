package Lesson17;

public class Lesson17 {

    private static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        System.out.println(ravenstvo(sb1,sb2));
    }
}
