import java.io.*;
import java.util.*;

/*
    Problem: New Year and Hurry
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int x = in.nextInt(), xx = 240 - in.nextInt(), total = 0;
        for (int i = 1; i <= x; ++i) {
            if (xx >= 5 * i) {
                xx -= 5 * i;
                ++total;
            }
        }
        pw.println(total);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}