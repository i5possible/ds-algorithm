package sorting;

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
		int i = left; 
		int j = right;
		
		T temp = null;
		
		if(left > right) {
			return ;
		}
		
		T basicValue = input[left];
		
		while(i != j) {
			
			while((-1 != input[j].compareTo(basicValue)) && i < j) 
				j--;
			while((1 != input[i].compareTo(basicValue)) && i < j)
				i++;
			
			if(i < j) {
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
		
		input[left] = input[i];
		input[i] = basicValue;

		quickSort(input,left,i-1);
		quickSort(input,i+1,right);
	}
	
}
