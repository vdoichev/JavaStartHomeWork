package Lesson18;

public class Lesson18 {

    public static void sortirovka(int[] array){
        int a;
        boolean nextIteration;
        do{
            nextIteration= false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    nextIteration = true;
                }
            }
        }
        while (nextIteration);
    }
    public static void main(String[] args) {
        int[] a1 = new int[]{1,-5, 7, 0, 4, -34};
        sortirovka(a1);
        for (int i = 0; i < a1.length; i++){
            System.out.print(a1[i]+" ");
        }

    }
}
