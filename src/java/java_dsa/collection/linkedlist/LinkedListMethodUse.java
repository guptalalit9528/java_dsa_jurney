package java_dsa.collection.linkedlist;

import java.sql.SQLOutput;
import java.util.*;

public class LinkedListMethodUse {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>(Arrays.asList(23,45,2,7,6,4,5,6));
        linkedlist.add(34);
         linkedlist.addLast(32);
        linkedlist.addFirst(2);
        linkedlist.offer(20);
        linkedlist.offerFirst(25);
        linkedlist.offerLast(399);
        linkedlist.push(89);

        linkedlist.removeFirst();
        linkedlist.removeLast();
        linkedlist.poll();
        linkedlist.pollFirst();
        linkedlist.pollLast();
        System.out.println(linkedlist.contains(2));
        System.out.println( linkedlist.peek());
        System.out.println(linkedlist.poll());
        System.out.println(linkedlist.get(2));
        System.out.println(linkedlist.set(5,15));
        System.out.println( linkedlist.size());
        System.out.println(linkedlist.stream().count());
        System.out.println(linkedlist.hashCode());
        System.out.println(linkedlist.spliterator().characteristics());

        System.out.println(linkedlist);
    }
}
