import java.io.*;
import java.util.*;

/*
    Problem: Good Investment or Not
    1) IF we multiply the inflation by 2 and it's smaller or equal to interest rate
    2) Then it's good else not
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() >= in.nextInt() * 2 ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}