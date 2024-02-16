import java.io.*;
import java.util.*;

/*
    Problem: Chefland Games
    1) If any of the input is equal to 1 then out else in
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            boolean flag = true;
            for (int i = 0; i < 4; i++) if (in.nextInt() == 1) flag = false;
            pw.println(flag ? "IN" : "OUT");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}