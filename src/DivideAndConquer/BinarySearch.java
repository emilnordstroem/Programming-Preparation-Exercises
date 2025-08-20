package DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,8,4,3,6,5,7,2,9,10));
        int foundAtIndex = search(numbers, 4);
        System.out.println(foundAtIndex);
    }

    private static int search(ArrayList<Integer> integers, int target){
        return binarySearch(integers, target, 0, integers.size() + 1);
    }

    private static int binarySearch(ArrayList<Integer> integers, int target, int left, int right){
        if(left > right){
            return -1;
        }
        int middle = left + (left + right) / 2;
        int candidateElement = integers.get(middle);

        if(candidateElement == target){
            return middle;
        } else if (candidateElement > target) {
            return binarySearch(integers, target, left, middle - 1);
        } else {
            return binarySearch(integers, target, middle + 1, left);
        }
    }

}
