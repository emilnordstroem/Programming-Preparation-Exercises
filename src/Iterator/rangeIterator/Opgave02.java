package Iterator.rangeIterator;

import Iterator.rangeIterator.models.Range;

public class Opgave02 {
    public static void main(String[] args) {
        Range range = new Range(5, 10);
        for (Integer integer : range) {
            System.out.println(integer);
        }
    }
}
