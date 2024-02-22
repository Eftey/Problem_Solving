import java.io.*;
import java.util.*;

/*
    Problem: Valentine is Coming
    1) X/Y gives him the total chocolate
    2) And since there's no fraction allowed, so he has to lose the decimal and keep the whole one
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();
            pw.println((int) (double) (x / xx));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}