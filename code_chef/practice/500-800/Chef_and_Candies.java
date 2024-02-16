import java.io.*;
import java.util.*;

/*
    Problem: Chef and Candies
    1) If there are more candies than children then no need to buy
    2) Else he has to buy total children - candies he has / 4 since each packet has 4 candies
    3) Then ceil the result since even if it's a half or 1 chocolate he has to buy the whole packet
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            pw.println((x < y) ? 0 : (int) (Math.ceil((double) (x - y) / 4)));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}