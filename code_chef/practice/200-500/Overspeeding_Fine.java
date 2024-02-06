import java.io.*;
import java.util.*;


/*
    Problem: Overspeeding Fine
    1) If it's within 70 then 0 else if within 100 then 500 else 2000
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x <= 70 ) pw.println(0);
            else if (x <= 100) pw.println(500);
            else pw.println(2000);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}