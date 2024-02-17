import java.io.*;
import java.util.*;

/*
    Problem: Qualify round
    1) If his total combined score is greater or equal than the required one then qualify else not
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() <= in.nextInt() + (in.nextInt() * 2) ? "Qualify" : "NotQualify");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}