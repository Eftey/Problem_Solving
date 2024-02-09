import java.io.*;
import java.util.*;

/*
    Problem: Reach Home
    1) Input * 5 = His total path with the current fuel
    2) If it's greater or equal than the path he has to cover then yes else no
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() * 5 >= in.nextDouble() ? "YES" : "NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}