import java.io.*;
import java.util.*;

/*
    Problem: Height of Rationals
    1) You have to find the one that's maximum
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(Math.max(in.nextInt(), in.nextInt()));
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}