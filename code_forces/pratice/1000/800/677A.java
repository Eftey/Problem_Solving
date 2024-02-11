import java.io.*;
import java.util.*;

/*
    Problem: Vanya and Fence
    1) We just have to check each friend's height and if it's only when greater than the max height
    2) Then we have to add 2 else we have to add 1 and get the total sum
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), max = in.nextInt(), sum = 0;
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x > max) sum += 2;
            if (x <= max) sum += 1;
        }
        pw.println(sum);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}