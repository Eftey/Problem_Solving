import java.io.*;
import java.util.*;

/*
    Problem: The Mango Truck
    1) Max mango load = (bridge withstand - truck weight) / weight of the mango
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            pw.println((z - y) / x);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}