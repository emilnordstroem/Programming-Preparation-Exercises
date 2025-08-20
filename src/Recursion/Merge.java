package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Merge {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(1,3,5,7,9,11,13,15,17,19,2,4,6,8,10,12,14,16,18,20)
        );
        List<Integer> mergedList = sort(list);
        for(int number : mergedList){
            System.out.print(number + " ");
        }
    }

    private static List<Integer> sort(List<Integer> list){
        if(list.size() <= 1){
            return list;
        }
        int middle = list.size() / 2;
        List<Integer> leftList = new ArrayList<>(list.subList(0, middle));
        List<Integer> rigthList = new ArrayList<>(list.subList(middle, list.size()));

        leftList = sort(leftList);
        rigthList = sort(rigthList);

        return merge(leftList, rigthList);
    }

    private static List<Integer> merge(List<Integer> list1, List<Integer> list2){
        List<Integer> mergedList = new ArrayList<>();

        int indexList1 = 0;
        int indexList2 = 0;

        while(indexList1 < list1.size() && indexList2 < list2.size()){
            if(list1.get(indexList1) <= list2.get(indexList2)){
                mergedList.add(list1.get(indexList1));
                indexList1++;
            } else {
                mergedList.add(list2.get(indexList2));
                indexList2++;
            }
        }
        while(indexList1 < list1.size()){
            mergedList.add(list1.get(indexList1));
            indexList1++;
        }
        while(indexList2 < list2.size()){
            mergedList.add(list2.get(indexList2));
            indexList2++;
        }
        return mergedList;
    }
}
