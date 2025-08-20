package DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,8,4,3,6,5,7,2,9,10));
        numbers = sort(numbers);
        for(int number : numbers){
            System.out.printf("%d, ", number);
        }
    }

    private static ArrayList<Integer> sort (ArrayList<Integer> list){
        return quickSort(list, 0, list.size() - 1);
    }

    private static ArrayList<Integer> quickSort(ArrayList<Integer> list, int low, int high){
        if(low < high){
            int partition = partition(list, low, high);
            quickSort(list, low, partition - 1);
            quickSort(list, partition + 1, high);
        }
        return list;
    }

    private static int partition(ArrayList<Integer> list, int low, int high){
        int pivot = list.get(low); // Pivot at last element
        int nextIndex = low + 1;
        int lastIndex = high;

        while(nextIndex <= lastIndex){
            if(list.get(nextIndex) <= pivot) {
                nextIndex++;
            } else if (list.get(lastIndex) > pivot) {
                lastIndex--;
            } else {
                swap(list, nextIndex, lastIndex);
                nextIndex++;
                lastIndex--;
            }
        }
        swap(list, low, lastIndex);
        return lastIndex;
    }

    private static void swap(ArrayList<Integer> list, int k, int l){
        int temp = list.get(k);
        list.set(k, list.get(l));
        list.set(l, temp);
    }
}
