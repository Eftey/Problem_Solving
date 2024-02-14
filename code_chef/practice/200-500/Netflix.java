import java.io.*;
import java.util.*;

/*
    Problem: Netflix
    1) We have to find whoever duo has the greater or equal price than the subscription price
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), xx = in.nextInt();
            if (x + y >= xx) pw.println("YES");
            else if (x + z >= xx) pw.println("YES");
            else if (y + z >= xx) pw.println("YES");
            else pw.println("NO");
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