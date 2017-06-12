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
	 * @param left  the leftest element index in  part of array that needing to sort
	 * @param right the rightest element index in  part of array that needing to sort
	 */
	private void quickSort(T[] input,int left,int right) {
		int leftStartIndex = left; 
		int rightStartIndex = right;
		
		if(left > right) {
			return ;
		}
		
		T basicValue = input[left];
		
		while(leftStartIndex != rightStartIndex) {
			
			while((-1 != input[rightStartIndex].compareTo(basicValue)) && leftStartIndex < rightStartIndex) 
				rightStartIndex--;
			while((1 != input[leftStartIndex].compareTo(basicValue)) && leftStartIndex < rightStartIndex)
				leftStartIndex++;
			
			if(leftStartIndex < rightStartIndex) {
				SortUtils.exchangeArrayValue(input, leftStartIndex, rightStartIndex);
			}
		}
		
		input[left] = input[leftStartIndex];
		input[leftStartIndex] = basicValue;

		quickSort(input,left,leftStartIndex-1);
		quickSort(input,leftStartIndex+1,right);
	}
	
}
