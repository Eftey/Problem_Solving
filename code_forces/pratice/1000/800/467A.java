import java.io.*;
import java.util.*;

/*
    Problem: George and Accommodation
    1) Here we just have to see if any room has 2 empty seat
    2) If so then count them and print them
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt(), c = 0;
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            if ((y - x) >= 2) c++;
        }
        pw.println(c);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}