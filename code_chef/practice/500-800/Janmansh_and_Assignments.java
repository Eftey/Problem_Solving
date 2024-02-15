import java.io.*;
import java.util.*;

/*
    Problem: Janmansh and Assignments
    1) Input + 3 for assignment 3 with 1 hour for each if it's smaller than 10 0r equal then Yes else No
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() + 3 <= 10 ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}