import java.io.*;
import java.util.*;

/*
    Problem: Break the Stick
    1) Here if x is either even or odd, we can have parity, meaning the result will have all even or all odd
    2) But for xx we cannot get even when xx is odd
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();
            pw.println(x % 2 == 0 || xx % 2 == 1 ? "YES" : "NO");
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}