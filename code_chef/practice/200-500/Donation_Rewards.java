import java.io.*;
import java.util.*;

/*
    Problem: Donation Rewards
    1) If <= 3 then Bronze else if <= 6 then silver else it's gold
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if(x <= 3) pw.println("BRONZE");
            else if (x <= 6) pw.println("SILVER ");
            else pw.println("GOLD");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}