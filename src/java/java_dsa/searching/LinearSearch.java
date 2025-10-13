package java_dsa.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,7,6};
        int target = 9 ;
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Item is present at " +i+ " index position");
                temp = temp +1;
            }
        }

        if(temp == 0){
            System.out.println("Item is not found is list");
        }
    }
}
