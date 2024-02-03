import java.io.*;
import java.util.*;

/*
    Problem: Puzzle Hunt
    1) If it's less than 30 then No else YES

 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            pw.println((x < 30) ? "NO" : "YES");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}