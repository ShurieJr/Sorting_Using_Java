package ca219;

import java.util.Arrays;

public class BubbleSort <T>{

    public static void main(String[] args) {
      Integer [] numbers = {23 , 2, 45, 1};
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(numbers));
    }

    //bubble sort - Asc order
    static <T extends Comparable<T>> void bubbleSort(T[] data){
        int size = data.length;
        T temp;
        //outer loop
        for(int index = size-1 ; index >= 0 ; index--){
            //inner loop
            for(int scan = 0; scan < index; scan++){
                if(data[scan].compareTo(data[scan + 1]) > 0){
                    //swap
                    temp = data[scan];
                    data[scan] = data[scan+1];
                    data[scan+1] = temp;
                }
            }
        }
    }
}
