import java.io.*;
import java.util.*;

/*
    Problem: ATM Machine
    1) For each iteration, we subtract k from each customer amount.
    2) But we do it only when there's enough money for them
    3) If we have enough then print 1 else print 0
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), k = in.nextInt();
            int[] arr = new int[x];
            for (int i = 0; i < x; i++) arr[i] = in.nextInt();
            for (int i = 0; i < x; i++) {
                if (k < arr[i]) pw.print(0);
                else {
                    pw.print(1);
                    k -= arr[i];
                }
            }
            pw.println();
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}