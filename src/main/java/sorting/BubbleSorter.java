package sorting;

import commons.SortUtils;

/**
 * Created by lianghong on 11/06/2017.
 */
public class BubbleSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public T[] sort(T[] input) {
        for (int outer = 0; outer < input.length - 1; outer++) {
            for (int inner = 0; inner < input.length - 1; inner++) {
                if (input[inner].compareTo(input[inner + 1]) > 0) {
                    SortUtils.exchangeArrayValue(input, inner, inner + 1);
                }
            }
        }
        return input;
    }
}
