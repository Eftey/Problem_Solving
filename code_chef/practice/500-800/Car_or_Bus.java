import java.io.*;
import java.util.*;

/*
    Problem: Car or Bus
    1) If bike is greater than bike else if car is greater than car else if it's equal than it's the same
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            if (x > y) pw.println("CAR");
            else if (x < y) pw.println("BIKE");
            else pw.println("SAME");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}