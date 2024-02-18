import java.io.*;
import java.util.*;

/*
    Problem: Maximise the Tastiness
    1) Find the max out of A and B
    2) Find the max out of B and C
    3) Then sum the result of those max values

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.max(in.nextInt(), in.nextInt()) + Math.max(in.nextInt(), in.nextInt()));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}