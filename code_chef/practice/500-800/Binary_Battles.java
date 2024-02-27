import java.io.*;
import java.util.*;

/*
    Problem: Binary Battles
    1) First we have to find the 2^x value by dividing x by 2 and count how many times we do this
    2) Then we use the formula to get the result (c - 1) * z) + (c * y)
    3) Here y occurs c times and  z occurs c - 1 times
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), c = 0;
            while (x > 1) {
                x /= 2;
                c++;
            }
            pw.println(((c - 1) * z) + (c * y));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}