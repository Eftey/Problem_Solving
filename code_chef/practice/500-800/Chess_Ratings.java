import java.io.*;
import java.util.*;

/*
    Problem: Chess Ratings
    1) We have to keep increasing the value of x until it's greater or equal than y
    2) While doing so we keep track of how many times we increased the value then print the count
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), c = 0;
            while (!(x >= y)) {
                c++;
                x += 8;
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