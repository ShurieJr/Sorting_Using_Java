package ca218;

import java.util.Arrays;

public class BubbleSorting<T> {
    public static void main(String[] args) {
        Integer[] numbers = {20 ,2 , 90 , 80};
        String[] names = {"Yuusuf" , "Ali" , "Gedi"};
        System.out.println("unsorted Array");
        System.out.println(Arrays.toString(names));
        bubbleSort(names);
        System.out.println("sorted Array");
        System.out.println(Arrays.toString(names));
    }

    //bubble sort
    static <T extends Comparable<T>> void bubbleSort(T[] data){
        int size = data.length;
        T temp;
        //outer loop
        for(int index = size-1; index >= 0; index--){
            //inner loop
            for(int scan =0; scan < index; scan++){
                if(data[scan].compareTo(data[scan + 1]) > 0){
                    //swap
                    temp = data[scan];
                    data[scan] = data[scan + 1];
                    data[scan+1] = temp;
                }
            }
        }
    }
}
