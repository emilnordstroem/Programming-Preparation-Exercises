package Sorting;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static List<Integer> selectionSort(List<Integer> list) {
        for (int outerIndex = 0; outerIndex < list.size() - 1; outerIndex++) {

            int minimumIndex = outerIndex;

            for (int innerIndex = outerIndex + 1; innerIndex < list.size(); innerIndex++) {

                if (list.get(innerIndex) < list.get(minimumIndex)) {
                    minimumIndex = innerIndex;
                }

            }

            int temp = list.get(minimumIndex);
            list.set(minimumIndex, list.get(outerIndex));
            list.set(outerIndex, temp);

        }
        return list;
    }

    public static List<Integer> selectionSortRecursive(List<Integer> list) {
        return selectionSortRecursive(list, 0, list.size() - 1);
    }

    private static List<Integer> selectionSortRecursive(List<Integer> list, int left, int right) {
        if (left >= right) {
            return list;
        }

        int minimumIndex = left;

        for (int index = left + 1; index <= right; index++) {

            if (list.get(index) < list.get(minimumIndex)) {
                minimumIndex = index;
            }

        }

        int temp = list.get(minimumIndex);
        list.set(minimumIndex, list.get(left));
        list.set(left, temp);

        return selectionSortRecursive(list, left + 1, right);
    }

}
