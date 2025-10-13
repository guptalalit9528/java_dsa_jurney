package java_dsa.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparisoonArrayLinkedListGet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        Random rn = new Random();

        for (long i = 0; i < 1_000_000; i++) {
            int value = rn.nextInt(0, 1000);
            list.add(value);
            list2.add(value);
        }

        int element = 100000;
        long startTime = System.nanoTime();
        System.out.println( list.get(element));     //Arraylist element ko get krne me fast hai
        long endTime = System.nanoTime();
        System.out.println("ArrayList Time Get : "+(endTime - startTime));


         element = 100000;
         startTime = System.nanoTime();
         System.out.println( list2.get(element));       //LinkedList element ko get krne me slow hai
         endTime = System.nanoTime();
         System.out.println("LinedList Time Get : "+(endTime - startTime));
    }

}
