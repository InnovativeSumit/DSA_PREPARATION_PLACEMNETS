//REVERSE OF AN ARAY USING TWO POINTERS
package SUMIT.JAVA.ARRAY.TWO_POINTERS.REVERSE_ARRAY;
import java.util.*;

// TC ==> O(N)
// SC ==> 0(1)
public class Optimal1 {
	static void ReverseArray(int[]array,int n) {
		int low = 0;
		int high = n-1;
		while(low<high) {
			int temp = array[low];
			array[low]= array[high];
			array[high]= temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		int[]array = {10,11,12,13,14,15};
		int n = array.length;
		ReverseArray(array,n);
		System.out.println("Reverse of the array is using Two Pointers is: ");
		for(int x: array) {
			System.out.print( x+ " ");
		}

	}
}


	
