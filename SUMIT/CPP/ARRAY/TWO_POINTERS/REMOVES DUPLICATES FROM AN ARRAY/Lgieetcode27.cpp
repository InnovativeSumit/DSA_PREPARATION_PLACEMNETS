//REMOVE A VALUE WITH ITS DUPLICATES FROM AN ARRAY

#include<bits/stdc++.h>
using namespace std;
// LEETCODES 27
// USING THE CONCEPTS OF TWO POINTERS
// TC ==>0(N)
// SC ==> 0(1)


   int removesDuplicates(vector<int>array, int target) {
    int n = array.size();
    if (n == 0)
      return 0; // EDGE CASE
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (array[i] != target) {
        array[count] = array[i];
        count++;
      }
    }
    return count;
  }

  int main() {
    vector<int>array = { 2, 3, 4, 4, 4, 5, 6, 6, 7, 7, 7, 8, 9, 9, 0, 0 };
    int target = 0;
    int len = removesDuplicates(array,target);

    cout<<"After removing the target value with its duplicates the length of the array is :"<< len;
    for (int i = 0; i < len; i++) {
      cout<< array[i] << " ";
    }
  }
