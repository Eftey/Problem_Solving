import java.io.*;
import java.util.*;

/*
    Problem: Minimum Pizzas
    1) We just have to multiply each friend with that they need and divide it by 4
    2) Since one pizza has only 4 slices
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), e = 0, o = 0;
        for (int tt = 0; tt < t; tt++) {
            pw.println((int) Math.ceil((double) (in.nextInt() * in.nextInt()) / 4));
        }
        pw.close();
    }

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}