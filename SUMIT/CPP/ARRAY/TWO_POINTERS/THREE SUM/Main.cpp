#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// TC -> O(N^2)
// SC -> O(1) (Ignoring sorting space)

vector<int> threeSum(vector<int>& arr, int target) {

    sort(arr.begin(), arr.end());

    int n = arr.size();

    for (int i = 0; i < n - 2; i++) {

        int low = i + 1;
        int high = n - 1;

        while (low < high) {

            long long sum = (long long)arr[i] + arr[low] + arr[high];

            if (sum == target) {
                return {arr[i], arr[low], arr[high]};
            }
            else if (sum < target) {
                low++;
            }
            else {
                high--;
            }
        }
    }

    return {-1, -1, -1};
}

int main() {

    vector<int> arr = {2, 1, 5, 4, 3, 0, 0};
    int target = 8;

    vector<int> ans = threeSum(arr, target);

    cout << "Triplet: ";
    for (int x : ans) {
        cout << x << " ";
    }

    return 0;
}