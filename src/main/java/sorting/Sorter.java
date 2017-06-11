package sorting;

/**
 * Created by lianghong on 11/06/2017.
 */
public interface Sorter<T extends Comparable<T>> {
    T[] sort(T[] input);
}
