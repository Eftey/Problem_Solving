import java.io.*;
import java.util.*;

/*
    Problem: Plus One
    1) Here we can check all the digits upto 8 and add +1 to them and return the arrary
    2) But if it's < 9 that means it's 9.
    3) So we have to put 0 whereever we found the value 9 to make it 10
    4) But if we traverse the array forward then we can't perform this task
    5) That's why we reversed the traversal in the loop
    6) Now the last element is = 0
    7) So we just have to put 1 before that last element
    8) We can do so by resizing the array since we need to add another digit
    9) Then arr[0] is the previous location before the last element
    10) So we put 1 in there to complete the array and return it
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        pw.println(Arrays.toString(plusOne(arr)));
        pw.close();
    }

    public static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[arr.length + 1];
        arr[0] = 1;
        return arr;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}