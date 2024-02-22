import java.io.*;
import java.util.*;

/*
    Problem: Chessboard Distance
    1)
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();
            pw.println((x + xx + 1) % 4 == 1 || (x + xx + 1) % 4 == 2 ? "Alice" : "Bob");
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}