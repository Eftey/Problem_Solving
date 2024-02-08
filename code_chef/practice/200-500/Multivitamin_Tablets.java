import java.io.*;
import java.util.*;

/*
    Problem: Multivitamin Tablets
    1) 3 times * total tablets = He has to take
    2) Then if it's smaller or equal to the remaining ones then he has to take else don't
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() * 3 <= in.nextInt() ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}