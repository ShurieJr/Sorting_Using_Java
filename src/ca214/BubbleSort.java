package ca214;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort <T>{
    public static void main(String[] args) {
        Integer[] numbers = {10 , 100 ,23 , 1};
        String[] Address = {"Waaberi" , "Xamarweyne" , "Yaqshid" , "Hodan"};
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(Address));

        //calling
        bubbleSort(numbers);
        bubbleSort(Address);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(Address));
    }

    //bubble sort
    static <T extends Comparable<T>> void bubbleSort(T[] data){
        int size = data.length;
        T temp;
        //outer loop
        for(int index = size -1; index > 0; index--){
            //inner loop
            for(int scan = 0; scan < index; scan++){
                if(data[scan].compareTo(data[scan + 1]) > 0){
                    //swap
                    temp = data[scan];
                    data[scan] = data[scan + 1];
                    data[scan + 1] = temp;
                }
            }
        }
    }
}
