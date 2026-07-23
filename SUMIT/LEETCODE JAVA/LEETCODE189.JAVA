// RIGHT ROTATION OF AN ARRAY UPTO K PLACES USING REVERSAL ALGORITHOMS 
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Main {

	public static void reverse(int[] array, int low, int high) {
		while (low < high) {
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			low++;
			high--;
		}
	}

	static void rotateArray(int[]array, int k) {
		int n = array.length;
		k = k%n;
		
		reverse(array, 0, n-1);
		reverse(array,0,k-1);
		reverse(array,k, n-1);

	}

	public static void main(String[]args) {
		int []array = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray(array,k);

		for(int x : array) {
			System.out.print(x +" ");;

		}

	}
}

