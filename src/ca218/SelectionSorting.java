package ca218;

import java.util.Arrays;

public class SelectionSorting<T> {
    public static void main(String[] args) {
    Integer[] numbers = {20 ,1  ,80 , 5};
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(numbers));

        SelectionSorting.<Integer>selecSortMethod(numbers);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(numbers));
    }

    //selection sort
    public static void selecSort(int [] data){
        int size = data.length;
        int min;
        for(int index=0; index < size-1; index++){
            min = index;
            for(int scan = index+1; scan < size; scan++) {
                if (data[scan] < data[min])
                    min = scan;
            }
                //swap
                int temp = data[min];
                data[min] = data[index];
                data[index] = temp;
            }
            }

            //selection sort using generic method
            public static <T extends Comparable<T>>void selecSortMethod(T[] data){
                int size = data.length;
                int min;
                for(int index=0; index < size-1; index++){
                    min = index;
                    for(int scan = index+1; scan < size; scan++) {
                        if (data[scan].compareTo(data[min]) < 0)
                            min = scan;
                    }
                    //swap
                    T temp = data[min];
                    data[min] = data[index];
                    data[index] = temp;
                }
            }
}
