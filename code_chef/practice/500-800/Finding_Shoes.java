import java.io.*;
import java.util.*;

/*
    Problem: Finding Shoes
    1) If he has more left shoes, then n 8 2 - n shoes
    2) Else n * 2 - m shoes

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            pw.println(n >= m ? (n * 2) - m : (n * 2) - n);
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}