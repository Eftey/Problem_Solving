import java.io.*;
import java.util.*;

/*
    Problem: Total Prize Money
    1) 10 * top price + 100-11+1 = 90 = Total price
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((in.nextInt() * 10) + (in.nextInt() * 90));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}