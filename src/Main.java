import java.io.*;
import java.util.*;

/*
    Problem: Police Recruits
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            c += in.nextInt();
            if (c < 0) d++;
            c = Math.max(0, c);
        }
        pw.println(d);

        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}