package Sorting;

import java.util.List;

public class QuickSort {

    public static void quickSort(List<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private static void quickSort(List<Integer> list, int left, int right){
        if (left < right) {
            int pivotIndex = partition(list, left, right);
            quickSort(list, left, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, right);
        }
    }

    private static int partition(List<Integer> list, int left, int right){
        int pivotElement = list.get(right);
        int lowIndex = left - 1;

        for (int index = left; index < right; index++) {
            if (list.get(index) <= pivotElement) {
                lowIndex++;
                swap(list, lowIndex, index);
            }
        }

        swap(list, lowIndex + 1, right);

        return lowIndex + 1;
    }

    private static void swap(List<Integer> list, int index1, int index2){
        if (index1 == index2) {
            return;
        }
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

}
