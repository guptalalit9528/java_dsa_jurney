package java_dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1<S> {
    public static void main(String[] args) {
        //Create an ArrayList
        List<String> cars = new ArrayList<>();

        //add an element
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("swift");
        cars.add("Royals royz");
        cars.add("neno");

        cars.add(0,"creata");        //add element using index
        System.out.println("1"+cars);

        System.out.println( "2"+cars.get(4));           //get the element

        cars.set(2,"lamborgini");                 //set an element
        System.out.println("3"+cars);

        cars.addFirst("maruti");      //add the first position element
        System.out.println("4"+cars);

        cars.addLast("nitro");        //add the last postion element
        System.out.println("5"+cars);

        cars.size();                        // size the string
        System.out.println("6"+cars);

        cars.remove("nitro");          //remove an string
        System.out.println("7"+cars);


        cars.contains("n");               //return true and false
        System.out.println("8"+cars);

        cars.clear();                     //all clear
        System.out.println("9"+cars);





    }
}
