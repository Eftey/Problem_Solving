import java.io.*;
import java.util.*;

/*
    Problem: C
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            String s = in.next();

            int[] x = new int[2], xx = new int[2];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') xx[0]++;
                else xx[1]++;
            }

            int c = Integer.MAX_VALUE, idx = -1;
            if ((n / 2) + (n % 2) <= xx[1]) {
                c = n;
                idx = 0;
            }

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    xx[0]--;
                    x[0]++;
                } else {
                    xx[1]--;
                    x[1]++;
                }

                int xc = x[0] + x[1], xxc = xx[0] + xx[1];
                if ((xc / 2) + (xc % 2) <= x[0] && (xxc / 2) + (xxc % 2) <= xx[1]) {
                    int d = Math.abs(xxc - xc);
                    if (d < c) {
                        c = d;
                        idx = i + 1;
                    }
                }
            }

            pw.println(idx);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}