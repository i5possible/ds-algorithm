package sorting;

import commons.SortUtils;

/**
 * Created by lianghong on 11/06/2017.
 */
public class BubbleSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public T[] sort(T[] input) {
        for (int outer = 0; outer < input.length; outer++) {
            for (int inner = outer; inner < input.length; inner++) {
                if (input[outer].compareTo(input[inner]) > 0) {
                    SortUtils.exchangeArrayValue(input, inner, outer);
                }
            }
        }
        return input;
    }
}
