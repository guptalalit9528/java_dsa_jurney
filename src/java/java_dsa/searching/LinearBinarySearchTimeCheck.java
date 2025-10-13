package java_dsa.searching;

import java.util.Arrays;
import java.util.Random;

public class LinearBinarySearchTimeCheck {
    public static void main(String[] args) {



        //input Random number
        Random ro = new Random();
        int [] arr = new int[10000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ro.nextInt(0,10);
        }




        //Linear search
        Long endTime ;
        int target = 1;
        int temp = 0;
        Long startTime = System.nanoTime();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Item is found Linear search : " +i);
                temp = temp + 1;
                endTime = System.nanoTime();
                System.out.println("Timing is Linear Search jab found ho item: "+(endTime-startTime));
                break;
            }
        }
        endTime = System.nanoTime();
        if(temp == 0){
            System.out.println("Item is not found is Linear Search");
            System.out.println("Timing is Linear Search jab not found ho item : "+(endTime-startTime));
        }







        //Binary search
        Arrays.sort(arr);
         target = 1;
        int left = 0;
        int high = arr.length -1;
        int mid = (left + high )/2;

         startTime = System.nanoTime();
        while (left <= high){
            if(arr[mid] == target){
                System.out.println("Item is found Binary Search: " +mid);
                endTime = System.nanoTime();
                System.out.println("Timing is Binary Search jab found ho item: "+(endTime - startTime));
                break;
            }else if(arr[mid] < target){
                left = mid +1;
            }else{
                high = mid - 1;
            }
            mid = (left + high)/2;
        }
        endTime = System.nanoTime();
        if (left > high){
            System.out.println("Item is not found Binary Search");
            System.out.println("Timing is Binary Search jab not found ho item : "+(endTime-startTime));
        }
    }
}
