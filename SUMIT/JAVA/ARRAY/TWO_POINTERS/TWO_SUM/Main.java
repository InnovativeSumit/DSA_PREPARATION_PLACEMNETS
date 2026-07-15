import java.util.*;
public class Main{
//Two Pointers [Opposite Direction]
// TC => O(N)
// SC => O(1)
    static int[]TwoSum(int[]array, int target){
        int n = array.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int sum = array[low] + array[high];
            if(sum == target){
                return new int[]{array[low],array[high]};
            }
            else if (sum<target){
                low++;
            }
            else high --;
        }
        return new int[]{};
    }
    
    
	public static void main(String[] args) {
	    int[] array ={1,2,3,4,5};
	    int target = 6;
		int[] ans = TwoSum(array, target);
        if (ans.length == 0) {
            System.out.println("No pair found.");
        } else {
            System.out.println("The pair is: " +"["+ ans[0] + "," + ans[1]+"]");
        }
	}
}