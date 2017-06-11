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
    
    @Test
    public void quick_sort_test() {
    	Integer[] input = {24,65,73,54,43};
    	Sorter<Integer> sorter = new QuickSorter<Integer>();
    	
    	Integer[] expected = {24,43,54,65,73};
    	Integer[] actual = sorter.sort(input);
    	Assert.assertArrayEquals(expected, actual);
    	
    }
}
