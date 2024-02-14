import java.io.*;
import java.util.*;

/*
    Problem: Dominant Army
    1) If one is grater than the sum of other two then Yes else No
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            if (x + y < z) pw.println("YES");
            else if (x + z < y) pw.println("YES");
            else if (y + z < x) pw.println("YES");
            else pw.println("NO");
        }
        pw.close();
    }

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}