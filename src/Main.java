import java.io.*;
import java.util.*;

/*
    Problem: The Cooler Dilemma 2
    1) If y is not divisible by x, then their division is the result
    2) Else we have to subtract 1 from the result
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            pw.println(y % x != 0 ? (int) (y / x) : (int) (y / x) - 1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}