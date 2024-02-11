import java.io.*;
import java.util.*;

/*
    Problem: Tyre problem
    1) Total tyres are the number of bikes * 2 + the number of cars * 4
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() * 2 + in.nextInt() * 4);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}