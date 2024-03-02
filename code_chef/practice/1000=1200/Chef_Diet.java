import java.io.*;
import java.util.*;

/*
    Problem: Chef Diet
    1) Here we take the remaining each time we take input
    2) Whenever the reining gets negative, we flag it and store the index
    3) Then if the flag is true, then yes else no and idx = stored index
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), eat = in.nextInt(), idx = 0, rem = 0;
            int[] arr = new int[x + 1];
            boolean flag = true;
            for (int i = 1; i <= x; i++) arr[i] = in.nextInt();

            for (int i = 1; i <= x; i++) {
                rem += arr[i];
                rem -= eat;
                if (rem < 0) {
                    flag = false;
                    idx = i;
                    break;
                }
            }
            pw.println(flag ? "YES" : "NO " + idx);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}