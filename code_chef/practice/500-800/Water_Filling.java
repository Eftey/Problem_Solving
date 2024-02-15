import java.io.*;
import java.util.*;

/*
    Problem: Water Filling
    1) If any of the two are empty then it's water filling time else not now
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            if(x == 0 && y == 0) pw.println("Water filling time");
            else if (x == 0 && z == 0) pw.println("Water filling time");
            else if(y == 0 && z == 0) pw.println("Water filling time");
            else pw.println("Not now");
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