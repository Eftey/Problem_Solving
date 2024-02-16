import java.io.*;
import java.util.*;

/*
    Problem: Is the Score Consistent
    1) If any of the previous input gets lower or equal value, then it's not possible else possible
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), b = in.nextInt();
            if (x <= a && y <= b) pw.println("POSSIBLE");
            else pw.println("IMPOSSIBLE");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}