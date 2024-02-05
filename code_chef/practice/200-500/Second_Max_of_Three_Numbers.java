import java.io.*;
import java.util.*;


/*
    Problem: Second Max of Three Numbers
    1) If x > y and x > z then x is the 1st largest number among the three
    2) Then just find whichever is the max out of the rest of the two
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();

            if (x > y && x > z) pw.println(Math.max(y, z));
            else if (y > x && y > z) pw.println(Math.max(x, z));
            else pw.println(Math.max(y, x));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}