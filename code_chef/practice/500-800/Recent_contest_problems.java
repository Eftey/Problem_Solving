import java.io.*;
import java.util.*;

/*
    Problem: Recent contest problems
    1) We use substring to check for both types and count their occurence
    2) And finally print it
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), c = 0;
            for (int i = 0; i < x; i++) {
                String s = in.next();
                if (s.contains("START")) c++;
            }
            pw.println(c + " " + (x - c));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}