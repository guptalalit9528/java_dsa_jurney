package java_dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparisonArrayLinkedListInsert {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        Random rn = new Random();
        for (long i = 0; i < 1_000_000; i++) {
            int value = rn.nextInt(0, 1000);
            list.add(value);
            list2.add(value);
        }
        //int index = 500000;
        int index = 0;
        int element = 1000;
        long startTime = System.nanoTime();
        //System.out.println(list.set(index,element));            //data set krne me ArrayList fast hai
        list.add(index,element);                                  //data add krne me ArrayList slow hai
        long endTime = System.nanoTime();
        System.out.println("Time of ArrayList neno second : " +( endTime - startTime) );



        //int index = 500000;
         index = 0;
         element = 10000;
         startTime = System.nanoTime();
        //System.out.println(list2.set(index,element));        //data set krne me linkedlist slow hai
         list2.add(index,element);                             //data add krne me linkedList fast hai
         endTime = System.nanoTime();
        System.out.println("Time of LinkedList neno second : " +( endTime - startTime));
    }
}
