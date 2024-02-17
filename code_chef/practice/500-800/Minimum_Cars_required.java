import java.io.*;
import java.util.*;

/*
    Problem: Minimum Cars required
    1) Each card has 4 seats so if n friends can be divisible by 4 then  n / 4 = number of cars
    2) Else we increase the card by 1
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            pw.println(x % 4 == 0 ? ((int) (x / 4)) : ((int) (x / 4) + 1));
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}