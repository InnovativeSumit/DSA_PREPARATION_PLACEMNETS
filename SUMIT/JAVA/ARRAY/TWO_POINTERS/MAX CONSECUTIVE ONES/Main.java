// MAX repeteativae ONES IN AN ARRAY 
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Main
{
    
    
    static int maxConseCutiveOnes(int[]array, int n ){
        
        int maxi = 0;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(array[i] == 1){
                count++;
                maxi = Math.max(maxi , count);
            }
            else{
                count = 0;
            }
        }
        return maxi ;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.println("Enter the elements of the array  : ");
		for(int i = 0 ; i < n ; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print ("Your array is  ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(array[i]+ " ");
		}
		
		System.out.println("");

		int len = maxConseCutiveOnes(array,n);
		System.out.println("The max repeteativae values of 1 in the array is : " + len);
		
	}


}
