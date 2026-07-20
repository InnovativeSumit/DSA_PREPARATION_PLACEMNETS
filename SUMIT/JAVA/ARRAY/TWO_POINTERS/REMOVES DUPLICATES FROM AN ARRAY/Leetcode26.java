//REMOVE DUPLICATES FROM AN ARRAY

import java.util.*;
// LEETCODES 26
// USING THE CONCEPTS OF TWO POINTERS
// TC ==>0(N)
// SC ==> 0(1)

public class Leetcode26 {
  static int removesDuplicates(int[] array) {
    int n = array.length;
    if (n == 0)
      return 0; // EDGE CASE
    int count = 1;
    for (int i = 1; i < n; i++) {
      if (array[i] != array[count - 1]) {
        array[count] = array[i];
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] array = { 2, 3, 4, 4, 4, 5, 6, 6, 7, 7, 7, 8, 9, 9, 0, 0 };
    int len = removesDuplicates(array);

    System.out.println("After removing the duplicates the length of the array is : " + len);
    for (int i = 0; i < len; i++) {
      System.out.print(array[i] + " ");
    }
  }
}