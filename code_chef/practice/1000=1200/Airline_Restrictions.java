import java.io.*;
import java.util.*;

/*
    Problem: Airline Restrictions
    1) We just have to check for all three value and their sum if they are smaller or equal then yes
    2) If not then no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt();
            if (a + b <= d && c <= e) pw.println("YES");
            else if (a + c <= d && b <= e) pw.println("YES");
            else if (b + c <= d && a <= e) pw.println("YES");
            else pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}