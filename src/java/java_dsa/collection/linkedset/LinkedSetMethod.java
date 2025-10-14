package java_dsa.collection.linkedset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetMethod {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
        linkedset.add(21);
        linkedset.add(2);
        linkedset.add(2);
        linkedset.add(1);
        linkedset.add(23);
        linkedset.add(44);
        linkedset.add(90);
        linkedset.add(78);
        System.out.println(linkedset);
        System.out.println(linkedset.stream().count());
        System.out.println(linkedset.contains(3));
        System.out.println(linkedset.getFirst());    //only use for LinkedSet
        System.out.println(linkedset.reversed());     //only use for LinkedSet


    }
}
