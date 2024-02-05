import java.io.*;
import java.util.*;


/*
    Problem: Bull or Bear
    1) If he sells greater than what he bought then profit
    2) If it's equal then neutral
    3) Else it's a loss
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();

            if (x > y) pw.println("LOSS");
            else if (y == x ) pw.println("NEUTRAL");
            else pw.println("PROFIT");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}