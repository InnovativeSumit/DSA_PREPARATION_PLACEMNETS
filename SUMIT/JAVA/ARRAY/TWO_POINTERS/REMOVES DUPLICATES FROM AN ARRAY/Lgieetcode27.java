
//REMOVE A TARGET VALUES WITH THEIR DUPLICATES FROM AN ARRAY
import java.util.*;
// LEETCODES 27
// USING THE CONCEPTS OF TWO POINTERS
// TC ==>0(N)
// SC ==> 0(1)

public class Lgieetcode27

{
    static int removesDuplicates(int []array , int target){
        int n = array.length;
        if (n == 0) return 0; //EDGE CASE
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != target) {
                array[count] = array[i];
                count++;
            }
        }
        return count;
    }
    
    
	public static void main(String[] args) {
	    int[]array = {2,3,4,4,4,5,6,6,7,7,7,8,9,9,0,0};
	    int target = 0;
	    int len = removesDuplicates(array , target); 
	    System.out.println("After removing the duplicates th elength of the array is : "+ len);
	    for(int i = 0 ; i<len ; i++){
		System.out.print( array[i] + " ");
	    }
	}
}