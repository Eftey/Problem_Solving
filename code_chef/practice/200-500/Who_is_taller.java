import java.io.*;
import java.util.*;

/*
    Problem: Who is taller!
    1) If Alice is taller then A else B

 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt();
            int b = in.nextInt();
            pw.println((a > b) ? "A" : "B");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}