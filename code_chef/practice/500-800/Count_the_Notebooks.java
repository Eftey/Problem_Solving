import java.io.*;
import java.util.*;

/*
    Problem: Count the Notebooks
    1) Given input * 10 we get the amaount of notebook it can create
    2) If it's 1 then 10 since 1 * 1000 / 100 = 10
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            pw.println(x == 1 ? 10 : x * 10);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}