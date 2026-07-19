//REVERSE OF AN ARAY USING TWO POINTERS
// TC ==> O(N)
// SC ==> 0(1)

#include<bits/stdc++.h>
using namespace std;

	void ReverseArray(vector<int>&array) {
		int n = array.size();
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

	int main() {
		vector<int>array = {10,11,12,13,14,15};
		ReverseArray(array);
		cout<<"Reverse of the array is using Two Pointers is: ";
		for(int x: array) {
			cout<< x <<" ";
		}

	}



	
