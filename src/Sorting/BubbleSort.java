package Sorting;

import java.util.List;

public class BubbleSort {
    public static List<Integer> bubbleSort(List<Integer> list){
        for (int outerIndex = 1; outerIndex < list.size(); outerIndex++) {
            for (int innerIndex = 0; innerIndex < list.size() - 1; innerIndex++) {
                int currentElement = list.get(innerIndex);
                int nextElement = list.get(innerIndex + 1);
                if (currentElement > nextElement) {
                    list.set(innerIndex, nextElement);
                    list.set(innerIndex + 1, currentElement);
                }
            }
        }
        return list;
    }

    public static List<Integer> bubbleSortRecursive(List<Integer> list){
        return bubbleSortRecursive(list, 1);
    }

    private static List<Integer> bubbleSortRecursive(List<Integer> list, int index){
        if (index >= list.size()) {
            return list;
        }

        for (int currentIndex = 0; currentIndex < list.size() - 1; currentIndex++) {
            int currentElement = list.get(currentIndex);
            int nextElement = list.get(currentIndex + 1);
            if (currentElement > nextElement) {
                list.set(currentIndex, nextElement);
                list.set(currentIndex + 1, currentElement);
            }
        }

        return bubbleSortRecursive(list, index + 1);
    }

}
