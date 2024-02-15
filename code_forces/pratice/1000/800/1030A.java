import java.io.*;
import java.util.*;

/*
    Problem: In Search of an Easy Problem
    1) We just find if there's any input with the value of 1
    2) If so we declear it as Hard problem
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        boolean flag = true;
        for (int tt = 0; tt < t; tt++) {
            if (in.nextInt() == 1) {
                flag = false;
                break;
            }
        }
        pw.println(flag ? "EASY" : "HARD");
        pw.close();
    }

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}