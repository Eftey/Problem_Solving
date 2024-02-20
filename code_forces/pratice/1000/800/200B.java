import java.io.*;
import java.util.*;

/*
    Problem: Drinks
    1) We have to add each value's percentage and divide it by the total length to get the answer
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        double x = 0;
        for (int tt = 0; tt < t; tt++) x += (double) in.nextInt() / 100;
        pw.println((x / t) * 100);
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}