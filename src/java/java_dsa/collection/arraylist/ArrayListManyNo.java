package java_dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListManyNo {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList();
        for (int i = 1; i<= 100; i++){
            num.add(i);
        }
        System.out.println(num);
        System.out.println(num.contains(50));
        System.out.println(num.stream().count());
        System.out.println(num.isEmpty());
        System.out.println(num.size());
        System.out.println(num.lastIndexOf(88));
        System.out.println(num.indexOf(6));

    }
}
