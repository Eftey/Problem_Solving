import java.io.*;
import java.util.*;

/*
    Problem: Six Friends
    1) First input * 3 = Double room cost
    2) Second input * 2 = Triple room cost
    3) The minimum is the price he wants
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.min((in.nextInt() * 3), (in.nextInt() * 2)));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}