
// THREE SUM PROBLEMS
//TC ==> O(N)
//SC ==> O(1)
import java.util.*;

public class Main1 {

    static int[] MovesZerosToEnd(int[] array) {
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
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 1, 0, 1, 0 };
        int[] result = MovesZerosToEnd(array);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}