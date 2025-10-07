package java_dsa.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {32,45,6,3,7,8,90,91,2};
        int temp , j ;
        for(int i = 0; i < arr.length; i++ ){
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j-1] > temp) {
                arr[j] = arr[j-1];
                j = j-1;
            }
                arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
