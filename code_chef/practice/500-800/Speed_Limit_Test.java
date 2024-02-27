import java.io.*;
import java.util.*;

/*
    Problem: Speed Limit Test
    1) Distance / hour = velocity
    2) Whoever is greater is the answer if equal then equal
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for(int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt(), y = in.nextInt(), yy = in.nextInt();
            pw.println((double) x / xx < (double) y / yy ? "Bob" : (double) x / xx > (double) y / yy ? "Alice" : "Equal");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}