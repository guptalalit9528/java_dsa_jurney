package java_dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEqualCheck {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);

        System.out.println(list1.equals(list2));

        if(list1 == list2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
