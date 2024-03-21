import java.io.*;
import java.util.*;

/*
    Problem: C
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt(), l = in.nextInt(), c = in.nextInt(), d = in.nextInt(), p = in.nextInt(), nl = in.nextInt(), np = in.nextInt();
        pw.println(Math.min((int) ((k * l) / nl), Math.min((int) (p / np), c * d)) / n);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}