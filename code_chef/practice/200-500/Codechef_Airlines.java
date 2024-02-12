import java.io.*;
import java.util.*;

/*
    Problem: Codechef Airlines
    1) Total planes he has 10 and seats are x so total seats = x * 10
    2) But he is the capacity hsa to be minimum between passenger and his pane capacity
    3) And with minimum * each seat price
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((Math.min(in.nextInt() * 10, in.nextInt())) * in.nextInt());
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}