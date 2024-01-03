package ca219;

import java.util.Arrays;

public class InsertionSort <T>{
    public static void main(String[] args) {
        String[] address = {"Waaberi" , "Hodan", "Xamarweyne" , "Kaaraan"};
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(address));

        bubbleSort(address);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(address));
    }

    //insertion sort
    static <T extends Comparable<T>> void bubbleSort(T[] data){
        int size = data.length;
        T value;
        int position;

        for(int index = 1; index < size; index++){
            value  =data[index];
            position = index;
            while(position > 0 && value.compareTo(data[position-1]) < 0){
                //shifting
                data[position] = data[position - 1];
                position--;
            }
            data[position] = value;
        }

    }
}
