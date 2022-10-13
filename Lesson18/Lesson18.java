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

    public static void showArray(String[][] arr){
        StringBuilder str = new StringBuilder("{ ");

        for (int i = 0; i<arr.length; i++){
            str.append("{");
            for (int j = 0; j<arr[i].length; j++){
                str.append(arr[i][j]);
                if (arr[i].length-j>1)
                    str.append(",");
                else
                    str.append("}");
            }
            if (arr.length-i>1)
                str.append(",");
            else
                str.append(" }");
        }
        System.out.println();
        System.out.println(str);
    }
    public static void main(String[] args) {
        int[] a1 = new int[]{1,-5, 7, 0, 4, -34};
        sortirovka(a1);
        for (int i = 0; i < a1.length; i++){
            System.out.print(a1[i]+" ");
        }

        String[][] array = new String[][]{{"00","01"},{"10"},{"10","11"}};
        showArray(array);

    }
}
