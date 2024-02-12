import java.io.*;
import java.util.*;

/*
    Problem: Bucket and Water Flow
    1) y * z = total water in z hours and + w = Total water in there
    2) If it's greater than overflow if equal then filled else unfilled
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int w = in.nextInt(), x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            if (((y * z) + w) > x) pw.println("overFlow");
            else if (((y * z) + w) == x) pw.println("filled");
            else pw.println("Unfilled");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}