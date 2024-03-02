import java.io.*;
import java.util.*;

/*
    Problem: Best Time to Buy and Sell Stock
    1)
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



    public static int maxProfit(int[] arr) {
        int rem = arr[0], prof = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < rem) rem = arr[i];
            else prof = Math.max(prof, arr[i] - rem);
        }
        return prof;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}