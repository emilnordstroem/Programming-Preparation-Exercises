package Iterator.rangeIterator.models;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator implements Iterator<Integer> {
    Range range;
    int currentRangeElement;

    public RangeIterator(Range range) {
        this.range = range;
        currentRangeElement = range.getFrom();
    }

    @Override
    public boolean hasNext() {
        try{
            return currentRangeElement <= range.getTo();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer next() {
        try{
            int nextElement = currentRangeElement;
            currentRangeElement++;
            return nextElement;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
