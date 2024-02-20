import java.io.*;
import java.util.*;

/*
    Problem: Mario and Bullet
    1) We have to divide and see if the result is negetive or equal to zero or not
    2) If so then it's 0 else, it's the subtraction
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            pw.println(Math.max(z - (y / x), 0));
        }
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}