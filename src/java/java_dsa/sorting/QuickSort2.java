package java_dsa.sorting;

public class QuickSort2 {
    public static void main(String[] args) {
        int [] arr = {15,45,3,2,5,7,3,4};
        int leng = arr.length;
        QuickSort2 qsm2 = new QuickSort2();
        qsm2.quickSortRecursion(arr, 0 , leng-1);
        qsm2.printArray(arr);
    }

    int partition (int[] arr, int low, int high){
        int pivot = arr[low + (high - low)/2];

        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                    low++;
                    high--;
            }
        }
        return low;
    }
    void quickSortRecursion(int[] arr, int low, int high){
        int pi = partition(arr, low, high);
        if(low < pi-1){
            quickSortRecursion(arr, low , pi-1);
        }
        if(pi < high){
            quickSortRecursion(arr, pi, high);
        }
    }
    void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
}
















