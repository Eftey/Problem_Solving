import java.io.*;
import java.util.*;


/*
    Problem: Passes for Fair
    1) Heavy if < 3 Moderate if < 7 else Heavy
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x < 3) pw.println("LIGHT");
            else if (x < 7) pw.println("MODERATE");
            else pw.println("HEAVY ");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}