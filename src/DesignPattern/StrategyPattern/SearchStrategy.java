package DesignPattern.StrategyPattern;

import java.util.List;

public interface SearchStrategy<T> {
    void search (List<T> list, T target);
    List<T> searchResult();
}
