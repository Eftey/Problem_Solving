import java.io.*;
import java.util.*;

/*
    Problem: Search Insert Position
    1) This is O(n) for O(log n) Use binary search
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[] arr = {1, 3, 5, 6};
        int t = 7;
        pw.println(searchInsert(arr, t));
        pw.close();
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) return (i);
            else if (nums[i] == target) return i;
        }
        return nums.length;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}