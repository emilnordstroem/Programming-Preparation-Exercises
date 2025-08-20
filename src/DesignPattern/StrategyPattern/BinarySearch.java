package DesignPattern.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch <T extends Comparable<T>> implements SearchStrategy<T> {
    private final List<T> memorization = new ArrayList<>();

    public BinarySearch() {}

    @Override
    public void search(List<T> list, T target) {
        search(list, target, 0, list.size() - 1);
    }

    private void search(List<T> list, T target, int left, int right){
        if (left > right) {
            return;
        }

        int middle = left + (right - left) / 2;
        T candidate = list.get(middle);
        if (candidate.equals(target)) {
            memorization.add(candidate);
            nearByMatches(list, target, middle);
        } else if (candidate.compareTo(target) > 0) {
            search(list, target, left, middle - 1);
        } else {
            search(list, target, middle + 1, right);
        }
    }

    private void nearByMatches(List<T> list, T target, int middle){
        int index = middle - 1;
        while (0 <= index && list.get(index).equals(target)) {
            memorization.add(list.get(index));
            index--;
        }
        index = middle + 1;
        while (index < list.size() && list.get(index).equals(target)) {
            memorization.add(list.get(index));
            index++;
        }
    }

    @Override
    public List<T> searchResult() {
        return new ArrayList<>(memorization);
    }

}
