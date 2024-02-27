import java.io.*;
import java.util.*;

/*
    Problem: Cyclic Quadrilateral
    1) Opposite angles are together = 180 if so then yes else no
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt(), xxx = in.nextInt(), xxxx = in.nextInt();
            pw.println(x + xxx == 180 && xx + xxxx == 180 ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}