import java.io.*;
import java.util.*;

/*
    Problem: Credit score
    1) If x greater than 750 then Yes else no
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(in.nextInt() >= 750 ? "YES" : "NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}