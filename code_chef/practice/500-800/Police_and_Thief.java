import java.io.*;
import java.util.*;

/*
    Problem: Police and Thief
    1) We just have to subtract time
    2) But to avoid negetive we use absolute

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.abs(in.nextInt() - in.nextInt()));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}