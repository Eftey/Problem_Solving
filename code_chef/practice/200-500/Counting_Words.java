import java.io.*;
import java.util.*;

/*
    Problem: Counting Words
    1) Total number of pages * Total words = Total pages with all words
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() * in.nextInt());
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}