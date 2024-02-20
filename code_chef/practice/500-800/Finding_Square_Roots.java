import java.io.*;
import java.util.*;

/*
    Problem: Finding Square Roots
    1) Built-in function is used to perform the squre root of the given number
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((int) (Math.sqrt(in.nextInt())));
        }
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}