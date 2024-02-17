import java.io.*;
import java.util.*;

/*
    Problem: Sasta Shark Tank
    1) First / 0.1 = First offer
    2) Second / 0.2 = Second offer
    3) Whichever is greater is answer
    4) If it's equal then any
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = (int) (in.nextInt() / .1), y = (int) (in.nextInt() / .2);
            if (x > y) pw.println("FIRST");
            else if (x == y) pw.println("ANY");
            else pw.println("SECOND");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}