package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0XC;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2 = 0b10100010100;
        short s3 = 02424;
        short s4 = 0X0514;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0b00;
        int i3 = 00;
        int i4 = 0X0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;
        long l2 = 0b111010110111100110100010101L;
        long l3 = 0726746425L;
        long l4 = 0X075BCD15L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        char c1 = 'v';
        char c2 = 34;
        char c3 = '\u0034';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
