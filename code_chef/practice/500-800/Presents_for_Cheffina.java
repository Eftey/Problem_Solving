import java.io.*;
import java.util.*;

/*
    Problem: Presents for Cheffina
    1) The formula is = x - (x/5) Since he's getting 1 for free after the 4th one
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            pw.println(x - (x / 5));

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}