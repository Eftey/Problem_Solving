import java.io.*;
import java.util.*;

/*
    Problem: Elections in Chefland
    1) We have to find the greater or equal than the required age to see how many voters left
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), n = in.nextInt(), c = 0;
            for (int i = 0; i < x; i++) {
                if (in.nextInt() >= n) c++;
            }
            pw.println(c);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}