import java.io.*;
import java.util.*;

/*
    Problem: 404 Not Found
    1) Not Found if 404 otherwise Found

 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(in.nextInt() != 404 ? "FOUND" : "NOT FOUND");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}