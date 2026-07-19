// REVERSE OF AN ARAY USING TWO POINTERS
//  TC ==> O(N)
//  SC ==> 0(1)

#include <bits/stdc++.h>
using namespace std;

void ReverseArray(vector<int> &array)
{
	int n = array.size();

	for (int i = 0; i < n / 2; i++)
	{
		int temp = array[i];
		array[i] = array[n - i - 1];
		array[n - i - 1] = temp;
	}
}

int main()
{
	vector<int> array = {10, 11, 12, 13, 14, 15, 16};

	ReverseArray(array);
	cout << "Reverse of the array is using Iterator For loop  is: ";
	for (int x : array)
	{
		cout << x << " ";
	}
}
