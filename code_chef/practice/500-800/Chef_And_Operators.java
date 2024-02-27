import java.io.*;
import java.util.*;

/*
    Problem: Chef And Operators
    1) If the first input is greater than greater-than sign
    2) If it's smaller than smaller-than sign else equal sign
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();
            pw.println(x > xx ? ">" : x < xx ? "<" : "=");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}