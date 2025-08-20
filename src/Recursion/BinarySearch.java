package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(1, 5, 2, 7, 3, 6, 8, 4, 9, 0, 10)
        );
        Collections.sort(list);
        int result = search(4, list);
        System.out.println(result);
    }

    private static int search(int target, List<Integer> list){
        return binarySearch(target, list, 0, list.size() - 1);
    }

    // Helper method
    private static int binarySearch(int target, List<Integer> list,
                                    int left, int right){
        if(left > right){
            return -1;
        }
        int middle = left + (right - left) / 2;
        if(list.get(middle) == target){
            return middle;
        }
        if(list.get(middle) > target){
            return binarySearch(target, list, left, middle - 1);
        } else {
            return binarySearch(target, list, middle + 1, right);
        }
    }
}
