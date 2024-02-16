import java.io.*;
import java.util.*;

/*
    Problem: Monopoly
    1) We check for each company with the rest of their sum to find if it's greater than the sum or not
    2) If so then yes else no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), b = in.nextInt();
            if (a > (b + x + y)) pw.println("YES");
            else if (b > (a + x + y)) pw.println("YES");
            else if (x > (b + a + y)) pw.println("YES");
            else if (y > (b + x + a)) pw.println("YES");
            else pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}