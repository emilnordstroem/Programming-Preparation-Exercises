package Sorting;

import java.util.List;

public class InsertionSort {

    public static List<Integer> insertionSort(List<Integer> list) {

        for (int index = 1; index < list.size(); index++) {
            int currentElement = list.get(index);
            int candidateIndex = index - 1;

            while (candidateIndex >= 0 && list.get(candidateIndex) > currentElement) {
                list.set(candidateIndex + 1, list.get(candidateIndex));
                candidateIndex -= 1;
            }

            list.set(candidateIndex + 1, currentElement);
        }

        return list;
    }


    public static List<Integer> insertionSortRecursive(List<Integer> list) {
        return insertionSortRecursive(list, 1);
    }

    public static List<Integer> insertionSortRecursive(List<Integer> list, int index) {
        if (index >= list.size()) {
            return list;
        }

        int currentElement = list.get(index);
        int candidateIndex = index - 1;

        while (candidateIndex >= 0 && list.get(candidateIndex) > currentElement) {
            list.set(candidateIndex + 1, list.get(candidateIndex));
            candidateIndex -= 1;
        }

        list.set(candidateIndex + 1, currentElement);

        return insertionSortRecursive(list, index + 1);
    }

}