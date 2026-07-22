// MAX repeteativae ONES IN AN ARRAY
// TC ==> O(N)
// SC ==> O(1)

#include <bits/stdc++.h>
using namespace std;

int maxConseCutiveOnes(vector<int> &array)
{
	int n = array.size();
	int maxi = 0;
	int count = 0;
	for (int i = 0; i < n; i++)
	{
		if (array[i] == 1)
		{
			count++;
			maxi = max(maxi, count);
		}
		else
		{
			count = 0;
		}
	}
	return maxi;
}

int main()
{
	vector<int> array = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};

	int len = maxConseCutiveOnes(array);
	cout << "The maximum consecutive one is: " << len;
}
