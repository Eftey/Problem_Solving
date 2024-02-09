import java.io.*;
import java.util.*;

/*
    Problem: Instagram
    1) If the first input is greater than second input times 10 then Yes else No
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() > in.nextDouble() * 10 ? "YES" : "NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}