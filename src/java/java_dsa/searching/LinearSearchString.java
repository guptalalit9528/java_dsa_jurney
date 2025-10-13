package java_dsa.searching;

public class LinearSearchString {
    public static void main(String[] args) {
        String [] arr = {"Rahul", "deepak" , "mayank", "lalit" , "gopal"};
        String target = "lalit";
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(target)){
                System.out.println("Item is present at " +i+ " index position");
                temp = temp +1;
            }
        }
        if(temp == 0){
            System.out.println("Item is not found is list");
        }
    }
}
