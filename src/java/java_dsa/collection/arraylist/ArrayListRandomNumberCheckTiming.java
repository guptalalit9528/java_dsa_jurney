package java_dsa.collection.arraylist;

import java.util.*;

public class ArrayListRandomNumberCheckTiming {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random rn = new Random();
        for (long i = 0; i < 1_000_000; i++) {
            int value = rn.nextInt(0, 1000);
            list.add(value);
        }

        int index = 500; // test index       //data insert krne me ArrayList slow hai
        int element = 1000;
        long startTime = System.nanoTime();
        list.add(index,element);
        long endTime = System.nanoTime();
       // System.out.println(list);
        System.out.println("Time of ArrayList neno second : " +( endTime - startTime) );

    }
}


