package java_dsa.sorting.time_check;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("----------------------------------Bubble Sort----------------------------------------------");
        Long startTime = System.nanoTime();
        List<Integer> mainList = input.getList(100000);
        AllSorting allSorting = new AllSorting();
        allSorting.bubblesorting(mainList);
        //System.out.println(mainList);
        Long endTime = System.nanoTime();
        System.out.println("Bubble Sort time : "+(endTime - startTime));


        System.out.println("-------------------------------Selection Sort---------------------------------------------");
         startTime = System.nanoTime();
        allSorting.selectionsort(mainList);
        //System.out.println(mainList);
        endTime = System.nanoTime();
        System.out.println("Selection Sort time : " +(endTime - startTime));


        System.out.println("-------------------------------Insertion Sort----------------------------------------------");
        startTime = System.nanoTime();
        allSorting.insertionsort(mainList);
        //System.out.println(mainList);
        endTime = System.nanoTime();
        System.out.println("Inserction Sort time : " +(endTime - startTime));


        System.out.println("-------------------------------Merge Sort-----------------------------------------------------");
        startTime = System.nanoTime();
        allSorting.mergesort(mainList);
        //System.out.println(mainList);
        endTime = System.nanoTime();
        System.out.println("Merge Sort : " +(endTime - startTime));


        System.out.println("-------------------------------Quick Sort-----------------------------------------------------");
        startTime = System.nanoTime();
        allSorting.quicksort(mainList,mainList.size());
        //System.out.println(mainList);
        endTime = System.nanoTime();
        System.out.println("Quick Sort : " +(endTime - startTime));


        System.out.println("-------------------------------Heap Sort-----------------------------------------------------");
        startTime = System.nanoTime();
        allSorting.heapsort(mainList);
        //System.out.println(mainList);
        endTime = System.nanoTime();
        System.out.println("Heap Sort : " +(endTime - startTime));
    }
}
