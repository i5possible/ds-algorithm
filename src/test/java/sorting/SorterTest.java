package sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lianghong on 11/06/2017.
 */
public class SorterTest {
    @Test
    public void bubble_sort_test() {
        Integer[] input = {2, 1, 4, 5, 3};
        Sorter<Integer> sorter = new BubbleSorter<Integer>();

        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] actual = sorter.sort(input);
        Assert.assertArrayEquals(expected, actual);
    }
}
