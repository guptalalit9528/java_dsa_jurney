package java_dsa.sorting.time_check;

import java_dsa.sorting.QuickSort2;

import java.util.ArrayList;
import java.util.List;


public class AllSorting {


    //Bubble Sort

    int flag = 0;

    public void bubblesorting(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, (j + 1));
                    list.set((j + 1), temp);
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }


    //Selection Sort

    public void selectionsort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            int temp = list.get(i);
            list.set(i, min);
            list.set(min, temp);
        }
    }


    //Insertion Sort

    public void insertionsort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            int j = i;
            while (j > 0 && list.get(j - 1) > temp) {
                list.set(j, list.get(j - 1));
                j = j - 1;
            }
            list.set(j, temp);
        }
    }






                           //Merge Sort

    public void mergesort(List<Integer> list) {
        dividelist(list, 0, list.size() - 1);
    }

    public void dividelist(List<Integer> list, int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            dividelist(list, lowerIndex, middle);

            dividelist(list, middle + 1, higherIndex);
            mergeList(list, lowerIndex, middle, higherIndex);
        }
    }

    public void mergeList(List<Integer> list, int lowerIndeX, int middle, int higerIndex) {

        List<Integer> temp = new ArrayList<>();
        int i = lowerIndeX;
        int j = middle + 1;

        while (i <= middle && j <= higerIndex) {
            if (list.get(i) <= list.get(j)) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }
        while (i <= middle) {
            temp.add(list.get(i));

            i++;
        }
        for (int k = 0; k < temp.size(); k++) {
            list.set(lowerIndeX + k, temp.get(k));
        }
    }







                    //Quick sort
public void quicksort(List<Integer> list, int leng) {
        quickSortRecursion(list, 0, leng - 1);

    }
    int partition(List<Integer> list , int low , int high){
        int pivot = list.get(low + (high - low)/2);

        while(low <= high){
            while(list.get(low) < pivot){
                low++;
            }
            while(list.get(high) > pivot){
                high--;
            }
            if(low <= high){
                int temp = list.get(low);
                list.set(low , list.get(high));
                list.set(high , temp);
                low++;
                high--;
            }
        }
        return low;
    }
    void quickSortRecursion(List<Integer> list, int low, int high){
        int pi = partition(list, low, high);
        if(low < pi-1){
            quickSortRecursion(list, low , pi-1);
        }
        if(pi < high){
            quickSortRecursion(list, pi, high);
        }
    }
    void printArray(List<Integer> list ){
        for(int i : list){
            System.out.print(i +" ");
        }

}








                     //Heap Sort

 public void heapsort (List<Integer> list){
        int leng = list.size();


     for (int i = leng / 2 - 1; i >= 0; i--) {
         heapify(list, leng, i);
     }


        for(int  i = leng - 1; i >=0; i--){
            int temp = list.get(0);
            list.set(0 , list.get(i));
            list.set(i ,temp);
            heapify(list  ,i,0 );
        }
}

    void heapify(List<Integer> list , int n, int i){
        int largest = i;
        int li = 2*i+1;
        int ri = 2*i+2;

        if(li < n && list.get(li) > list.get(largest)){
            largest = li;
        }
        if(ri < n && list.get(ri) > list.get(largest)){
            largest = ri;
        }

        if(largest != i){
            int temp = list.get(i);
            list.set(i , list.get(largest));
            list.set(largest , temp);

            heapify( list ,  n ,largest);
        }
    }
}





















