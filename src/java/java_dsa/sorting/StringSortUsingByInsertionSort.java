package java_dsa.sorting;

public class StringSortUsingByInsertionSort {
    public static void main(String[] args) {
        String []str = {"lalit","kunal","mmit","nit"};
        for (int i = 0; i < str.length; i++){
            String temp = str[i];
            int j = i;
            while(j > 0 && str[j-1].compareTo (temp) > 0){
                str[j] = str[j+1];
                j = j -1;
            }
            str[j] = temp;
        }
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i]+"  ");
        }
    }
}
