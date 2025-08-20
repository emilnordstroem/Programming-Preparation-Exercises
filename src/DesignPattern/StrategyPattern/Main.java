package DesignPattern.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> unsortedIntergerList = new ArrayList<>(
                List.of(10,4,2,7,8,2,5,9,6,3,1,10)
        );
        SearchStrategy<Integer> linearSearchStrategy = new LinearSearch<>();

        List<Integer> sortedIntergerList = new ArrayList<>(
                List.of(1,2,3,4,4,4,5,6,7,8,8,9,10)
        );
        SearchStrategy<Integer> binarySearchStrategy = new BinarySearch<>();
        //======================================================================
        SearchAlgorithm<Integer> searchAlgorithm = new SearchAlgorithm<>(linearSearchStrategy);

        linearSearchStrategy.search(unsortedIntergerList, 10);
        List<Integer> LinearsearchResult = linearSearchStrategy.searchResult();
        LinearsearchResult.forEach(result -> System.out.print(result + " "));

        System.out.println();

        binarySearchStrategy.search(sortedIntergerList, 4);
        List<Integer> binarySearchResult = binarySearchStrategy.searchResult();
        binarySearchResult.forEach(result -> System.out.print(result + " "));

    }

}
