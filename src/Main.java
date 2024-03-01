import java.io.*;
import java.util.*;

/*
    Problem: TCS Examination
    1)
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            pw.println(a > 50 ? "A" : b > 50 ? "B" : c > 50 ? "C" : "NOTA");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}