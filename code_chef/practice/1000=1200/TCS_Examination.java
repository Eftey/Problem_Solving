import java.io.*;
import java.util.*;

/*
    Problem: TCS Examination
    1) We just check if the sum of their score is greater or not
    2) Then check if they have the same in total score or not
    3) Then check for DSA then TOC and for default case
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            int aa = in.nextInt(), bb = in.nextInt(), cc = in.nextInt();
            if (a + b + c > aa + bb + cc) pw.println("DRAGON");
            else if (a + b + c == aa + bb + cc) {
                if (a == aa && b == bb && c == cc) pw.println("TIE");
                else if (a > aa) pw.println("DRAGON");
                else if (a == aa && b > bb) pw.println("DRAGON");
                else pw.println("SLOTH");
            } else pw.println("SLOTH");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}