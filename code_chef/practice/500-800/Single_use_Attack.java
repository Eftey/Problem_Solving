import java.io.*;
import java.util.*;

/*
    Problem: Single-use Attack
    1) We reduce by the special attack first then we subtract the normal attack value
    2) And count every time we performed such a task
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int h = in.nextInt(), x = in.nextInt(), k = in.nextInt(), c = 1;
            h -= k;
            while (h > 0) {
                h -= x;
                c++;
            }
            pw.println(c);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}