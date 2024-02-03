import java.io.*;
import java.util.*;

/*
    Problem: Audible Range
    1) If it's within 67 to 45000 then it hears

 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            pw.println((x >= 67 && x <= 45000) ? "YES" : "NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}