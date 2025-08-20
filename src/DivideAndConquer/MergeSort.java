package DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,8,4,3,6,5,7,2,9,10));
        numbers = mergeSort(numbers);
        for(int number : numbers){
            System.out.printf("%d, ", number);
        }
    }

    private static ArrayList<Integer> mergeSort(ArrayList<Integer> integers){
        if(integers.size() <= 1){
            ArrayList<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(integers.getFirst());
            return singleElementList;
        }
        int middle = integers.size() / 2;
        ArrayList<Integer> lowerList = mergeSort(new ArrayList<>(integers.subList(0, middle)));
        ArrayList<Integer> upperList = mergeSort(new ArrayList<>(integers.subList(middle, integers.size())));
        return mergeAlgorithm(lowerList, upperList);
    }

    public static ArrayList<Integer> mergeAlgorithm(ArrayList<Integer> lowerList, ArrayList<Integer> upperList) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int lowerIndex = 0;
        int upperIndex = 0;

        while (lowerIndex < lowerList.size() && upperIndex < upperList.size()) {
            if (lowerList.get(lowerIndex) <= upperList.get(upperIndex)) {
                mergedList.add(lowerList.get(lowerIndex));
                lowerIndex++;
            } else {
                mergedList.add(upperList.get(upperIndex));
                upperIndex++;
            }
        }

        while (lowerIndex < lowerList.size()) {
            mergedList.add(lowerList.get(lowerIndex));
            lowerIndex++;
        }

        while (upperIndex < upperList.size()) {
            mergedList.add(upperList.get(upperIndex));
            upperIndex++;
        }

        return mergedList;
    }
}
