package sorting;

import commons.SortUtils;

/**
 * Created by lianghong on 11/06/2017.
 */
public class BubbleSorter<T extends Comparable<T>> implements Sorter<T>{
    @Override
    public T[] sort(T[] input) {
    	for(int i = 0;i < input.length;i++) {
    		for(int j = 0;j < input.length-i-1;j++) {
    			if(1==(input[j].compareTo(input[j+1]))) {
    				SortUtils.exchangeArrayValue(input, j, j+1);
    			}
    		}
    	}
        return input;
    }
}
