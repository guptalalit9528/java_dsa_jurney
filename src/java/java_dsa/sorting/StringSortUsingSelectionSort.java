package java_dsa.sorting;

public class StringSortUsingSelectionSort {
    public static void main(String[] args) {
        String[] str = {"mosham", "dushyant", "sharad", "ganesh", "dhruv", "harsh", "ajay", "gaurav"};
        int min;
        String temp = "";
        for (int i = 0; i < str.length; i++) {
            min = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[min]) > 0) {
                    min = j;
                }
            }
            temp = str[i];
            str[i] = str[min];
            str[min] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + "  ");
        }

    }
}

