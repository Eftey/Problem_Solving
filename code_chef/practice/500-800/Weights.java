import java.io.*;
import java.util.*;

/*
    Problem: Weights
    1) We have to find the sum of any two inputs or all three inputs to get the result of 1st input
    2) if any of the input is equal to the 1st input, it's a yes then as well
    3) Otherwise it's a no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), x = in.nextInt(), xx = in.nextInt(), xxx = in.nextInt();
            pw.println((x + xx + xxx == n) ? "YES" : x + xx == n ? "YES" : (x + xxx == n) ? "YES" : (xx + xxx == n) ? "YES" : (x == n || xx == n || xxx == n) ? "YES" : "NO");
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}