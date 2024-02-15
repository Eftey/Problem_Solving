import java.io.*;
import java.util.*;

/*
    Problem: Subscriptions
    1) Since total number / 6
    2) If the number is divisible by 6 then it's fine
    3) Else the rest of them has to buy another subscription
    4) That's why we ceil the values
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), e = 0, o = 0;
        for (int tt = 0; tt < t; tt++) {
            pw.println((int) (Math.ceil((double) in.nextInt() / 6) * in.nextInt()));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}