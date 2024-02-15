import java.io.*;
import java.util.*;

/*
    Problem: Climbing Stairs
    1) This is nothing but a Fibonacci sequence.
    2) We just have to get the sum from it's current value and it's previous value
    3) Using recursion can solve it but i O(n) time complexity
    4) But with this formula it's much faster O(log n)
    5) Formula: https://assets.leetcode.com/users/images/beb61634-e186-481b-bcc6-734dc958cdc9_1708033964.7590559.png
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(climbStairs(3));
        pw.close();
    }

    public static int climbStairs(int n) {
        return (int) ((1 / Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5)) / 2, n + 1) - Math.pow((1 - Math.sqrt(5)) / 2, n + 1)));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}