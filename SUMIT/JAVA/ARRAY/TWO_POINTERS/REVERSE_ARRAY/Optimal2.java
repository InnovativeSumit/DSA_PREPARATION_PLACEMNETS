package SUMIT.JAVA.ARRAY.TWO_POINTERS.REVERSE_ARRAY;

//REVERSE OF AN ARAY USING ITERATORS FOR LOOP

import java.util.*;

public class Optimal2{

// TC ==> O(N)
// SC ==> 0(1)

	static void ReverseArray(int[]array,int n) {
	for(int i = 0 ; i < n/2 ; i++) {
		int temp = array[i];
		array[i] = array[n-i-1];
		array[n-i-1]= temp;
	}
}
public static void main(String[] args) {
	int[]array = {10,11,12,13,14,15,16};
	int n = array.length;
	ReverseArray(array,n);
	System.out.println("Reverse of the array is using Iterator For loop  is: ");
	for(int x: array) {
		System.out.print( x+ " ");
	}

}
}

