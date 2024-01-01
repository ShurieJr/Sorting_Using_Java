package ca218;

import java.util.Arrays;
public class InsertionSorting <T>{
    public static void main(String[] args) {
        Integer[] numbers = {20 ,2 , 90 , 80};
        String[] names = {"Yuusuf" , "Ali" , "Gedi"};
        System.out.println("unsorted Array");
        System.out.println(Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("sorted Array");
        System.out.println(Arrays.toString(numbers));
    }
    //insertion method
    static <T extends Comparable<T>> void insertionSort(T[] data){
        int size = data.length;;
        T value;
        int position;

        //outer loop
        for(int index = 1; index < size ; index++){
            value = data[index];
            position = index;

            while(position > 0 && value.compareTo(data[position-1]) <0){
                //shifitig
                data[position] = data[position - 1];
                position--;
            }

            data[position] = value;
        }
    }
}
