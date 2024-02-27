import java.io.*;
import java.util.*;

/*
    Problem: Endless Appetizers
    1) The formula is = (x + r/30) / y
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt(), xxx = in.nextInt();
            pw.println((int) Math.ceil((double) (x + (double) (xxx / 30)) / xx));

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}