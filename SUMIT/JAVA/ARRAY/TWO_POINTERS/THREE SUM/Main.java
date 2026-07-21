// THREE SUM PROBLEMS
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)

public class Main
{

	static int[] threeSum(int[]array,int target) {
		Arrays.sort(array);
		int n = array.length;
		for(int i  = 0 ; i < n ; i++) {
			int low = i+1;
			int high = n-1;

			while(low<high) {
				long sum = 0;
				sum = sum + array[i];
				sum = sum + array[low];
				sum = sum + array[high];

				if(sum == target ) {
					return new int[] {array[i],array[low],array[high]};
				}
				else if(sum<target) low++;
				else high--;
			}
		}

		return new int[] {-1,-1,-1};

	}


	public static void main(String[] args) {
		int target = 8;
		int[]array = {2,1,5,4,3,0,0};
		int[] ans = threeSum(array,target);
		System.out.println(Arrays.toString(ans));

	}
}