package ca219;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {23 , 2, 45, 1};
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(numbers));

        selectSort(numbers);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(numbers));
    }
    public static void selectSort(int[] data){
    int size = data.length;
    int min;
    for(int index=0; index<=size-1; index++){
        min = index;
        for(int scan =index+1; scan < size; scan++){
            if(data[scan] < data[min])
                min=scan;
            //swap
            int temp = data[min];
            data[min] = data[index];
            data[index] = temp;

        }
    }
    }
}
