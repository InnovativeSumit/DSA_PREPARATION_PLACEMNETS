
// THREE SUM PROBLEMS
//TC ==> O(N)
//SC ==> O(1)
import java.util.*;

public class Main2 {

    static void MovesZerosToEnd(int[] array) {
        int n = array.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 1, 0, 1, 0 };
        MovesZerosToEnd(array);
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}