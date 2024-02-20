import java.io.*;
import java.util.*;

/*
    Problem: Chef and Water Bottles
    1) We have to find the minimum of the three but after we divide the z
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            pw.println(Math.min((z / y), x));
        }
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}