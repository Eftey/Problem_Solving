import java.io.*;
import java.util.*;

/*
    Problem: Remove Element
    1) We check if the given value is in the array or not
    2) if it's not then we store that number into the same array since we don't need it for any other use
    3) Return the index that was used to store the values in to get the size of the newly created array
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int val = 2;
        int[] xx = {0, 1, 2, 2, 3, 0, 4, 2};
        pw.println(removeElement(xx, val));
        pw.close();
    }

    public static int removeElement(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}