import java.io.*;
import java.util.*;

/*
    Problem: Remove Element
    1) Here we have to count the digits of lucky numbers in the number
    2) Then if that number is equal to the lucky digit then it's nearly lucky
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