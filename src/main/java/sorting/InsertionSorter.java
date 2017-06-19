package sorting;

import commons.SortUtils;

/**
 * Created by lianghong on 19/06/2017.
 */
public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public T[] sort(T[] input) {
        for (int outer = 1; outer < input.length; outer++) {
            T temp = input[outer];
            int inner = outer - 1;
            while (inner >= 0 && input[inner].compareTo(temp) > 0) {
                SortUtils.exchangeArrayValue(input, inner, outer);
                inner--;
            }
        }
        return input;
    }
}
