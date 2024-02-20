import java.io.*;
import java.util.*;

/*
    Problem: The Last Levels
    1) We keep increasing the value by y until
    2) It's divisible by 3
    3) And when that happens, we add +z to it
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), c = 0;
            for (int i = 1; i <= x; i++) {
                c += y;
                if (i % 3 == 0 && i != x) c += z;
            }
            pw.println(c);
        }
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}