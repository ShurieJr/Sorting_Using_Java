package ca214;

import java.util.Arrays;

public class SelectionSort<T> {
    public static void main(String[] args) {
    Integer [] numbers = { 120 ,1 , 40 , 34};
    String[] names = {"Zayid" , "Yusuf" , "Ali" , "Gedi"};

        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        //call
        selectionSort(numbers);
        selectionSort(names);

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

    }

    //Selection sort
    static  <T extends Comparable<T>> void selectionSort(T[] data){
        int size = data.length;
        int min;
        //outer loop
        for(int index = 0 ; index < size-1; index++){
            min = index;
            //inner loop
            for(int scan =index+1; scan<size; scan++ ){
                if(data[scan].compareTo(data[min]) < 0)
                    min  = scan;
            }
            //swap
            T temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }
}
