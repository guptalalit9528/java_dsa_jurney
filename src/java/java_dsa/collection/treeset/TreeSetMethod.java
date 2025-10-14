package java_dsa.collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethod {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(34);
        treeSet.add(40);
        treeSet.add(3);
        treeSet.add(45);
        treeSet.add(65);
        treeSet.add(90);
        treeSet.add(36);

        System.out.println(treeSet);

        System.out.println(treeSet.headSet(53,true));
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.clone());
        System.out.println(treeSet.ceiling(33));
        System.out.println(treeSet.floor(44));
        System.out.println(treeSet.higher(54));
        System.out.println(treeSet.lower(5));
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.tailSet(36));
        System.out.println(treeSet.floor(44));
        System.out.println(treeSet.isEmpty());
    }
}
