import java.io.*;
import java.util.*;

/*
    Problem: Tram
    1) We have to keep track of the sum and subtract x always and then add y
    2) In the meanwhile also keep track of the max value through the sum to get the answer
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), sum = 0, max = 0;
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            sum -= x;
            sum += y;
            if (max <= sum) max = sum;
        }
        pw.println(max);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}