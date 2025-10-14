package java_dsa.collection.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMethod {
    public static void main(String[] args) {
        HashSet<Integer>  hashSet = new HashSet<>();    //duplicate value not allow
        hashSet.add(23);
        hashSet.add(22);
        hashSet.add(93);
        hashSet.add(73);
        hashSet.add(2);
        hashSet.add(43);

        System.out.println(hashSet);
        System.out.println(hashSet.clone());
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.removeAll(hashSet));
        System.out.println(hashSet);
        System.out.println(hashSet.addAll(Arrays.asList(23,1,432,43,2,43,5,1)));
        System.out.println(hashSet);
        System.out.println(hashSet.stream().count());
    }
}
