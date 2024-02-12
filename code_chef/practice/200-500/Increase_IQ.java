import java.io.*;
import java.util.*;

/*
    Problem: Increase IQ
    1) If his IQ + 7 is greater than 170 then yes else no
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(in.nextInt() + 7 > 170 ? "YES" : "NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}