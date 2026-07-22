// REMOVE DUPLICATES FROM AN ARRAY

#include <bits/stdc++.h>
using namespace std;
// LEETCODES 26
// USING THE CONCEPTS OF TWO POINTERS
// TC ==>0(N)
// SC ==> 0(1)

int removesDuplicates(vector<int> array)
{
  int n = array.size();
  if (n == 0)
    return 0; // EDGE CASE
  int count = 1;
  for (int i = 1; i < n; i++)
  {
    if (array[i] != array[count - 1])
    {
      array[count] = array[i];
      count++;
    }
  }
  return count;
}

int main()
{
  vector<int> array = {2, 3, 4, 4, 4, 5, 6, 6, 7, 7, 7, 8, 9, 9, 0, 0};
  int len = removesDuplicates(array);

  cout << "After removing the duplicates the length of the array is :" << len;
  for (int i = 0; i < len; i++)
  {
    cout << array[i] << " ";
  }
}
