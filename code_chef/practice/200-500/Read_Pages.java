import java.io.*;
import java.util.*;

/*
    Problem: Read Pages
    1) If the number of pages that he could read can exceed the number of pages he could read per day
    2) Meaning if he has 5 pages to read and as like 3 days
    2) While on each day he can only read about 2 pages
    3) Then he could read = 3 days * 2 pages = 6 pages in total
    4) So with 5 pages in total, and he can read 6 pages
    7) Therefore he can read it thoroughly
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() <= (in.nextInt() * in.nextInt()) ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}