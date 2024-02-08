import java.io.*;
import java.util.*;

/*
    Problem: Minimum Coins
    1) Since Notes has more values then we divide the price / 10
    2) The remaining values are the number of notes
    3) We can achieve it by just modding the price with 10 to get the remainder which is the number of notes
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() % 10);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}