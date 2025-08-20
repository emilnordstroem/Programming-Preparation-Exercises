package DesignPattern.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch <T> implements SearchStrategy<T> {
    private final List<T> memorization = new ArrayList<>();

    public LinearSearch() {}

    @Override
    public void search(List<T> list, T target) {
        for (T candidate : list) {
            if (candidate == target) {
                memorization.add(candidate);
            }
        }
    }

    @Override
    public List<T> searchResult() {
        return new ArrayList<>(memorization);
    }


}
