import java.io.*;
import java.util.*;

/*
    Problem: Air Quality Index
    1) If the number is less then 100 then it's YES else NO
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(in.nextInt() < 100 ? "YES" : "NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}