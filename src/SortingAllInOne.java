import java.util.Arrays;

public class SortingAllInOne {
    public static void main(String[] args) {
   Integer[] id = { 100 , 10 , 5 , 30};
    String[] address = {"Waaberi" , "XamarWeyne" ,  "Hodan" };

        System.out.println("unsorted array");
        System.out.println(Arrays.toString(id));

        //call
        insertionSort(id);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(id));
    }

    //slection sort
    static <T extends Comparable<T>> void selectionSort(T[] data){
        int size = data.length;
        int min;

        for(int index = 0; index < size-1; index++){
            min = index;
            for(int scan =index+1; scan < size; scan++){
                if(data[scan].compareTo(data[min]) < 0)
                    min = scan;
            }
            //swap
            T temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }
    //bubble sort
    static <T extends Comparable<T>> void bubbleSort(T[] data){
        int size = data.length;
        T temp;

        for(int index =size-1; index >= 0; index--){
            for(int scan =0 ; scan < index; scan++){
                if(data[scan].compareTo(data[scan + 1] ) > 0){
                    //swap
                    temp = data[scan + 1];
                    data[scan + 1] =  data[scan];
                    data[scan ] = temp;
                }
            }
        }
    }
    static <T extends Comparable<T>> void insertionSort(T[] data){
        int size = data.length;
        T value;
        int position;

        for(int index = 1; index < size; index++){
            value = data[index];
            position = index;
           while(position > 0 && value.compareTo(data[position -1])<0){
               data[position] = data[position -1];
               position--;
           }
           data[position] = value;
        }

    }
}