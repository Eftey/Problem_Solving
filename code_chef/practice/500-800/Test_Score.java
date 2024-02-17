import java.io.*;
import java.util.*;

/*
    Problem: Test Score
    1) Total marks = x * y
    2) Chef need = total marks - given
    3) If the needed marks can be divisible by the marks obtained from each question then yes else no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            pw.println(((x * y) - z) % y == 0 ? "YES" : "NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}