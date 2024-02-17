import java.io.*;
import java.util.*;

/*
    Problem: Reverse The Number
    1) Here we take the input from String builder and then reverse it
    2) Next we parse it back to integer to get the correct output of 0032 to 32
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            StringBuilder sb = new StringBuilder(in.next());
            sb.reverse();
            pw.println(Integer.parseInt(sb.toString()));
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}