package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static List<Integer> mergeSort(List<Integer> list){
        return mergeSort(list, 0, list.size() - 1);
    }

    private static List<Integer> mergeSort(List<Integer> list, int left, int right){
        if (left >= right) {
            return new ArrayList<>(list.subList(left, right + 1));
        }
        int middle = left + (right - left) / 2;
        List<Integer> leftList = mergeSort(list, left, middle);
        List<Integer> rightList = mergeSort(list, middle + 1, right);
        return merge(leftList, rightList);
    }

    private static List<Integer> merge(List<Integer> leftList, List<Integer> rightList){
        List<Integer> mergedLists = new ArrayList<>();

        int leftListIndex = 0;
        int rightListIndex = 0;

        while (leftListIndex < leftList.size() && rightListIndex < rightList.size()) {
            int leftListElement = leftList.get(leftListIndex);
            int rightListElement = rightList.get(rightListIndex);
            if (leftListElement <= rightListElement) {
                mergedLists.add(leftListElement);
                leftListIndex++;
            } else {
                mergedLists.add(rightListElement);
                rightListIndex++;
            }
        }

        while (leftListIndex < leftList.size()) {
            mergedLists.add(leftList.get(leftListIndex));
            leftListIndex++;
        }

        while (rightListIndex < rightList.size()) {
            mergedLists.add(rightList.get(rightListIndex));
            rightListIndex++;
        }

        return mergedLists;
    }

}
