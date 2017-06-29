package sorting;

import commons.SortUtils;

/**
 * Created by lianghong on 18/06/2017.
 */
public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public T[] sort(T[] input) {
        for (int outer = 0; outer < input.length; outer++) {
            int min = outer;
            for (int inner = outer; inner < input.length; inner++) {
                if (input[inner].compareTo(input[min]) < 0) {
                    min = inner;
                }
            }
            SortUtils.exchangeArrayValue(input, outer, min);
        }
        return input;
    }
}
