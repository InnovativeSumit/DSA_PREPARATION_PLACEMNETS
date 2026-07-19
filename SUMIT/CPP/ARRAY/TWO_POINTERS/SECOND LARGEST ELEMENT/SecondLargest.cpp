// FIND THE SECOND LARGEST ELEMENTS IN AN ARRAY
// USING ONE TRAVERSALS
// TC ==> O(N)
// SC ==> 0(1)

#include <bits/stdc++.h>
using namespace std;

int SecondLargest(vector<int> &array)
{
    int n = array.size();
    int largest = -1;
    int secondLargest = -1;

    for (int i = 0; i < n; i++)
    {
        if (array[i] > largest)
        {
            secondLargest = largest;
            largest = array[i];
        }
        else if (array[i] < largest && array[i] > secondLargest)
        {
            secondLargest = array[i];
        }
    }
    return secondLargest;
}

int main()
{
    vector<int> array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    cout << "Second Largest Elements Without Sorting by Optimal way using One passing = " << SecondLargest(array);
}
