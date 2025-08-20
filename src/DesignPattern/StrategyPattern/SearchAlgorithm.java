package DesignPattern.StrategyPattern;

public class SearchAlgorithm <T> {
    private SearchStrategy<T> searchStrategy;

    public SearchAlgorithm(SearchStrategy<T> searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public SearchStrategy<T> getSearchStrategy() {
        return searchStrategy;
    }

    public void setSearchStrategy(SearchStrategy<T> searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

}
