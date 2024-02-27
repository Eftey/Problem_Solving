import java.io.*;
import java.util.*;

/*
    Problem: Reach fast
    1) Formula x - y / k
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int cf = in.nextInt(), cc = in.nextInt(), k = in.nextInt(), c = 1;
            pw.println((int) Math.ceil((double) Math.abs(cf - cc) / k));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}