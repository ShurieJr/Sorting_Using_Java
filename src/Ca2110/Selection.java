package Ca2110;

import java.util.Arrays;

public class Selection<T> {
    public static void main(String[] args) {
        Integer[] numbers = {200 , 2, 1 , 10};
        String[] names = {"Yusuf" , "Zayid" , "Gedi" , "Ahmed"};

        System.out.println("unsorted array");
        System.out.println(Arrays.toString(names));
        //call
        selectionSort(names);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(names));
    }

    //selection sort
    static <T extends Comparable<T>> void selectionSort(T[] data){
        int size = data.length;
        int min;
        for(int index= 0 ; index < size-1; index++){
            min = index;
            //inner loop
            for(int scan = index + 1; scan < size; scan++){
                if(data[scan].compareTo(data[min]) < 0)
                    min = scan;
            }
            //swap
            T temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }
}
