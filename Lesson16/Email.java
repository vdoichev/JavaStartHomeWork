package Lesson16;

public class Email {
    private static void email(String str){
        final char LEFT_CHAR = '@';
        final char RIGHT_CHAR = '.';
        byte left = 0;
        byte right = 0;
        for (int i = 0; i < str.length();i++){

            if (str.charAt(i) == LEFT_CHAR){
                left = (byte)i;
            }
            if (str.charAt(i) == RIGHT_CHAR){
                right = (byte)i;
            }
            if (left>0 && right>0){
                System.out.println(str.substring(left+1,right));
                left = 0;
                right = 0;
            }
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.com; ona@gmail.com");
    }
}
