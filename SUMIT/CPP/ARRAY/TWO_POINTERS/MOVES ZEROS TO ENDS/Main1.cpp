// MOVES ZEROS TO THE END
// TC ==> O(N)
// SC ==> O(1)
#include <bits/stdc++.h>
using namespace std;

void MovesZerosToEnd(vector<int> &array)
{
    int n = array.size();
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (array[i] != 0)
        {
            int temp = array[i];
            array[i] = array[count];
            array[count] = temp;
            count++;
        }
    }
}

int main()
{
    vector<int> array = {0, 1, 0, 1, 0, 1, 0};
    MovesZerosToEnd(array);
    for (int x : array)
    {
        cout << x << " ";
    }
}
