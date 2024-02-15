import java.io.*;
import java.util.*;

/*
    Problem: Chef in his Office
    1) With 4 days working for x + Friday has the extra = total days
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), e = 0, o = 0;
        for (int tt = 0; tt < t; tt++) {
            pw.println((in.nextInt() * 4) + in.nextInt());
        }
        pw.close();
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}