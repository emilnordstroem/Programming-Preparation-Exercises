package Iterator.rangeIterator.models;

import java.util.Iterator;

public class Range implements Iterable<Integer>{
    private int from;
    private int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(this);
    }
}
