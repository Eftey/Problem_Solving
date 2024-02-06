import java.io.*;
import java.util.*;


/*
    Problem: Bidding
    1) Whoever has the biggest wins
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int y = in.nextInt(), x = in.nextInt(), z = in.nextInt();
            if (x > y && x > z) pw.println("Bob");
            else if (y > x && y > z) pw.println("Alice");
            else pw.println("Charlie");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}