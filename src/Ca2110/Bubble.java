package Ca2110;

import java.util.Arrays;
import java.util.Date;

public class Bubble <T>{
    public static void main(String[] args) {
        Integer[] numbers = {200 , 2, 1 , 10};
        String[] names = {"Yusuf" , "Zayid" , "Gedi" , "Ahmed"};

        System.out.println("unsorted array");
        System.out.println(Arrays.toString(names));

        //call
        bubbleSort(names);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(names));
    }
    //bubble Sort
    static <T extends Comparable<T>> void bubbleSort(T[] data){
        int size = data.length;;
        T temp;

        for(int index = size-1; index >=0 ; index--){
            for(int scan = 0; scan < index; scan++){
                if(data[scan].compareTo(data[scan + 1]) > 0){
                    //swap
                    temp = data[scan];
                    data[scan] =data[scan + 1];
                    data[scan + 1] = temp;
                }
            }
        }
    }
}
