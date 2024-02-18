import java.io.*;
import java.util.*;

/*
    Problem: Discus Throw
    1) Find the max out of two
    2) Then compare the result with the last input to find the max

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.max(Math.max(in.nextInt(), in.nextInt()), in.nextInt()));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}