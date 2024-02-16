import java.io.*;
import java.util.*;

/*
    Problem: Sugarcane Juice Business
    1) Subtracting 20% + 20% + 30 % from 50 * price gives us the profit
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt() * 50;
            pw.println(x - ((((x / 10) * 2) * 2) + ((x / 10) * 3)));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}