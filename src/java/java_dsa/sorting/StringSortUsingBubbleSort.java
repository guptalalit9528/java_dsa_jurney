package java_dsa.sorting;

public class StringSortUsingBubbleSort {
    public static void main(String[] args) {
        String [] str = {"deepak","kunal","lalit","manoj","kalu","amrish bhaiya","gopal","mayank","rudra"};
        String temp;
        for (int i = 0; i < str.length; i++){
             int flag = 0;
            for(int j = 0; j < str.length - 1 - i; j++){
                if(str[j].compareTo(str[j+1]) > 0){
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
        }
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
