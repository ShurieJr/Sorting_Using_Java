package ca214;

import java.util.Arrays;

public class InsertionSort<T> {
    public static void main(String[] args) {
        Integer[] numbers = {10 , 100 ,23 , 1};
        String[] Address = {"Waaberi" , "Xamarweyne" , "Yaqshid" , "Hodan"};

        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(Address));

        //calling
        insertionSort(numbers);
        insertionSort(Address);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(Address));
    }

    //Insertion Sort
    static <T extends Comparable<T>> void insertionSort(T[] data){
        int size = data.length;
        T value;   // element
        int position;  //index
        for(int index = 1; index < size; index++){
            value = data[index];
            position = index;

            while (position > 0 && value.compareTo(data[position-1]) < 0){
                //shifting
                data[position] = data[position-1];
                position--;
            }
            data[position] = value;
        }
    }

}
