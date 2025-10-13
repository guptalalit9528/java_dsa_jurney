package java_dsa.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,5,7,9,10,13,15,16};
        int target = 3;
        int li = 0;
        int hi = arr.length-1;
        int mid = (li+hi)/2;

        while(li <= hi) {
            if (arr[mid] == target) {
                System.out.println("Element is found: " + mid);
                break;
            } else if (arr[mid] < target) {
                li = mid + 1;
            } else {
                hi = mid - 1;
            }
            mid = (li + hi) / 2;
        }
        if(li > hi){
            System.out.println("Element is not found");
        }
    }
}
