import java.io.*;
import java.util.*;

/*
    Problem: Games
    1) Just check each Ai for all Bi if they're the same
    2) If they're same then count++ and print count
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        int res = 0;
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) if (i != j && a[i] == b[j]) res++;
        pw.println(res);
        pw.close();
    }


    static void debug(Object... obj) {System.err.println(Arrays.deepToString(obj));}
}