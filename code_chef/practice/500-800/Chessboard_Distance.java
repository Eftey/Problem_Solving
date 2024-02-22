import java.io.*;
import java.util.*;

/*
    Problem: Chessboard Distance
    1) |x1 - x2| = M and |y1 - y2| = N
    2) The max of M and N is the answer
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt(), x1 = in.nextInt(), xx1 = in.nextInt();
            pw.println(Math.max(Math.abs(x - x1), Math.abs(xx - xx1)));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}