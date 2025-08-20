package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerSequence = new ArrayList<>(
                List.of(
                        1,3,10,2,9,8,4,0,5,6,7
                )
        );

        // Non-recursion sorting
//        System.out.println(BubbleSort.bubbleSort(integerSequence)); <-- Pass
//        System.out.println(InsertionSort.insertionSort(integerSequence)); <-- Pass
//        integerSequence.forEach(integer -> System.out.print(integer + " "));
//        System.out.println(SelectionSort.selectionSort(integerSequence)); <-- Pass

        // Recursion sorting
//        System.out.println(BubbleSort.bubbleSortRecursive(integerSequence)); <-- Pass
//        System.out.println(InsertionSort.insertionSortRecursive(integerSequence)); <-- Pass
//        System.out.println(MergeSort.mergeSort(integerSequence)); <-- Pass
//        QuickSort.quickSort(integerSequence); <-- Pass
//        System.out.println(SelectionSort.selectionSortRecursive(integerSequence));

    }

}
