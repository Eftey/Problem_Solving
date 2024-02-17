import java.io.*;
import java.util.*;

/*
    Problem: Problems in your to-do list
    1) We just have to check if the problems are greater or equal to 1000 or not
    2) If so then count the numbers and print it
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), c = 0;
            for (int i = 0; i < x; i++) if (in.nextInt() >= 1000) c++;
            pw.println(c);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}