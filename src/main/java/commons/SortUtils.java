package commons;

/**
 * 
 * @author shangxiaobin on 11/06/2017.
 *
 */
public class SortUtils {
	
	
	/**
	 * this method is used for exchanging values of a array
	 * @param input  
	 * @param left
	 * @param right
	 */
	public static <T> void exchangeArrayValue(T[] input,int left,int right) {
		T temp = input[left];
		input[left] = input[right];
		input[right] = temp;
	}

}
