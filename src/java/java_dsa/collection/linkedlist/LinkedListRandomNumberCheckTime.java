package java_dsa.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNumberCheckTime {
    public static void main(String[] args) {

        Random rn = new Random();

        List<Integer> list1 = new LinkedList<>();
        for (long i = 0; i < 1_000_000; i++) {
            int value = rn.nextInt(0, 1000);
            list1.add(value);
        }
        int index = 500; // test index    //data insert krne me linkedlist fast hai
        int element = 10000;
        long startTime = System.nanoTime();
        list1.add(index,element);
        long endTime = System.nanoTime();
       //System.out.println(list1);
        System.out.println("Time of LinkedList neno second : " +( endTime - startTime));
    }
}
