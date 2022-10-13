package Lesson19;


public class Lesson19 {
    public static String[][] abc(String[] ... args){

        String[][] arr = new String[args.length][];
        for (int i = 0; i<args.length; i++){
            arr[i] = args[i];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        String[] arr1 = new String[]{"One", "Two"};
        String[] arr2 = new String[]{"Three", "Four", "Five"};

        for (int i = 0; i<args.length; i++){
            args[i] = null;
        }

        for (String[] a: abc(args, arr1, arr2)) {
            for (String b: a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
