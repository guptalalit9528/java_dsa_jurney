package java_dsa.collection.VectorList;

import java.util.Arrays;
import java.util.Vector;

public class VectorUseMethod {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(1,7,8,45,32,5,90,87,56,38));
        v.add(24);
        v.addElement(32);
        System.out.println(v.capacity());
        System.out.println(v.isEmpty());
        v.addLast(32);
        v.addFirst(2);

        v.removeFirst();
        v.removeLast();
        System.out.println(v.contains(2));
        System.out.println(v.get(2));
        System.out.println(v.set(5,15));
        System.out.println(v.size());
        System.out.println(v.stream().count());
        System.out.println(v.hashCode());
        System.out.println(v);
    }
}
