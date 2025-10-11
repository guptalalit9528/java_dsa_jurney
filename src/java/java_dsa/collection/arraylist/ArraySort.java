package java_dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 100; i >= 0; i--){
            numbers.add(i);

        }
        System.out.println(numbers);
        Collections.sort(numbers);

        for (int i = 0; i <= 100; i++) {
            System.out.print(i+" ");
        }
    }
}

