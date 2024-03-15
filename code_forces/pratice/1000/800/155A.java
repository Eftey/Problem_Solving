import java.io.*;
import java.util.*;

/*
    Problem: I_love_%username%
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt(), x = in.nextInt(), xx = 0, c = 0;
        xx = x;
        for (int tt = 0; tt < t - 1; tt++) {
            int ax = in.nextInt();
            if (ax > x) {
                c++;
                x = ax;
            } else if (ax < xx) {
                c++;
                xx = ax;
            }
        }
        pw.println(c);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}