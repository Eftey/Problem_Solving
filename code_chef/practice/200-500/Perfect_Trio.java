import java.io.*;
import java.util.*;

/*
    Problem: Perfect Trio
    1) We find which one is the max out of the 3.
    2) Then with the remaining two we add them together
    3) If the sum is equal to the max one then Yes else No
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            if (x > y && x > z) pw.println(x == (y + z) ? "YES" : "NO");
            else if (y > x && y > z) pw.println(y == (x + z) ? "YES" : "NO");
            else pw.println(z == (y + x) ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}