import java.io.*;
import java.util.*;

/*
    Problem: TV Discount
    1) If both the price subtract discounts are less than 2nd one then first
    2) If it's equal then any else second
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), b = in.nextInt();
            if ((x - a) > (y - b)) pw.println("Second");
            else if ((x - a) < (y - b)) pw.println("First");
            else pw.println("Any");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}