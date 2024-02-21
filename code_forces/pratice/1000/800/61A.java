import java.io.*;
import java.util.*;

/*
    Problem: Ultra-Fast Mathematician
    1) Here we have to find if there's any values that are identical in both strings
    2) If so then we print 0 else we print 1 in that position
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next(), ss = in.next();
        for (int i = 0; i < s.length(); i++) pw.print(s.charAt(i) != ss.charAt(i) ? 1 : 0);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}