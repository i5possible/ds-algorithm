package sorting;

import commons.SortUtils;

/**
 * 
 * @author shangxiaobin on 11/06/2017.
 * 
 * @param <T>
 */
public class QuickSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public T[] sort(T[] input) {
		quickSort(input,0,input.length-1);
		return input;
	}
	
	/**
	 * 
	 * @param input the array of needing to sort
	 * @param leftStart  the leftest element index in  part of array that needing to sort
	 * @param rightStart the rightest element index in  part of array that needing to sort
	 */
	private void quickSort(T[] input,int leftStart,int rightStart) {
		if (input == null || input.length == 0 || leftStart >= rightStart) {
			return ;
		}
		int left = leftStart;
		int right = rightStart;

		T basicValue = input[leftStart];
		while(left < right) {
			while((input[right].compareTo(basicValue) > 0))
				right--;
			while((input[left].compareTo(basicValue) < 0))
				left++;
			if(left < right) {
				SortUtils.exchangeArrayValue(input, left, right);
			}
		}
		input[leftStart] = input[left];
		input[left] = basicValue;

		quickSort(input,leftStart,left-1);
		quickSort(input,left+1,rightStart);
	}
}
