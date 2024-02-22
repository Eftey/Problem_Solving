import java.io.*;
import java.util.*;

/*
    Problem: X Jumps
    1) Best way to get the minimum is if it's divisible by the number
    2) Else we add the reminder with the result
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();
            pw.println(x % xx == 0 ? x / xx : (x % xx) + (x / xx));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}