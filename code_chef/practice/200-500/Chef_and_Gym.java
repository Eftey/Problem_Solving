import java.io.*;
import java.util.*;

/*
    Problem: Chef and Gym
    1) If he can't join the gym then 0
    2) If he can join the gym then 1
    3) If he can join the gym and have a trainer then 2
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            if (x + y <= z) pw.println(2);
            else if ((x <= z)) pw.println(1);
            else pw.println(0);
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