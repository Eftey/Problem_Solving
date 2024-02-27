import java.io.*;
import java.util.*;

/*
    Problem: Pass or Fail
    1) If the total number is greater or equal than what he optaioned then pass else fail
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), x = in.nextInt(), p = in.nextInt();
            pw.println(x * 3 - (n - x) >= p ? "PASS" : "FAIL");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}