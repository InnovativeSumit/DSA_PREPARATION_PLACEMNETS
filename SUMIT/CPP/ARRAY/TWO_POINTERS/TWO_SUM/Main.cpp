//TWO SUM
// TC ==> O(N)
// SC ==> 0(1)

#include<bits/stdc++.h>
using namespace std;

   vector<int>TwoSum(vector<int>&array, int target){
        int n = array.size();
        int low = 0;
        int high = n-1;
        while(low<high){
            int sum = array[low] + array[high];
            if(sum == target){
                return {array[low],array[high]};
            }
            else if (sum<target){
                low++;
            }
            else high --;
        }
        return {-1,-1};
    }
    
    
	int main() {
	    vector<int> array ={1,2,3,4,5};
	    int target = 6;
		vector<int> ans = TwoSum(array, target);
        if (ans.size() == 0) {
            cout<<"No pair found.";
        } else {
            cout<<"The pair is: " <<ans[0] << "," << ans[1];
        }
	}
