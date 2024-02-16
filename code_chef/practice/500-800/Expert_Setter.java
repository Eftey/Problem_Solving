import java.io.*;
import java.util.*;

/*
    Problem: Expert Setter
    1) 50% means half of the input1 so we divide it to get the answer
    2) If it's greater than 2nd input then yes else no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((int) (Math.ceil((double) in.nextInt() / 2)) <= in.nextInt() ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}