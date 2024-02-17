import java.io.*;
import java.util.*;

/*
    Problem: Air Conditioner Temperature
    1) We have to consider Bob's demand and always see if he has compatible one with the rest of them
    2) If so then yes else no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a =in.nextInt(), b = in.nextInt(), c = in.nextInt();
            pw.println((a <= b && c <= b) ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}