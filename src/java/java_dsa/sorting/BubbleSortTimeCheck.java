package java_dsa.sorting;

import java.util.Random;

public class BubbleSortTimeCheck {

    public static void main(String[] args) {
        Random rn = new Random();
        int arr[] = new int[10000];
         for(int k = 0; k < arr.length; k++){
               arr[k] = rn.nextInt();
         }


         int flag = 0;
         //Long endTime;
         Long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i ++){
            for (int j = i+1; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        Long endTime = System.nanoTime();
        System.out.println("Bubble sort jab sort hoo jaye tab : "+(endTime-startTime));
    }
}
