package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {

    public static ArrayList abc(String ... args){
        ArrayList <String> result = new ArrayList<>(args.length);
        for (String list: args) {
            result.add(list);
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(abc("C", "B", "L", "A"));
    }
}
