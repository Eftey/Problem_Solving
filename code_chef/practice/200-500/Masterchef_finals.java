import java.io.*;
import java.util.*;

/*
    Problem: Master chef finals
    1) If input is within 10 then YES otherwise NO
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) pw.println(in.nextInt() <= 10 ? "YES" : "NO");
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}