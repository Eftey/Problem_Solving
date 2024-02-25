import java.io.*;
import java.util.*;

/*
    Problem: Divisibility Problem
    1) If the difference is smaller or equal than d then yes else no
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), d = in.nextInt();
            pw.println(Math.abs(x - y) <= d ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}