import java.io.*;
import java.util.*;

/*
    Problem: Mario and Transformation
    1) We just find the reminder if it's 1 then huge if it's 0 then normal else it's small
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x % 3 == 0) pw.println("NORMAL");
            else if (x % 3 == 1) pw.println("HUGE");
            else pw.println("SMALL");
        }
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}