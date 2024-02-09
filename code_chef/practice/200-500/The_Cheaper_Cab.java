import java.io.*;
import java.util.*;

/*
    Problem: The Cheaper Cab
    1) If x < y then First else if x > y then second else any
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            if(x < y) pw.println("FIRST");
            else if (x > y) pw.println("SECOND ");
            else pw.println("ANY");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}