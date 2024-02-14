import java.io.*;
import java.util.*;

/*
    Problem: Beautiful Year
    1) Just use the Built-in Square Root function to solve it

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(mySqrt(8));
        pw.close();
    }

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}