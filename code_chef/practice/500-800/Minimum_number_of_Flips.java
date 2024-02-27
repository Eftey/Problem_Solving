import java.io.*;
import java.util.*;

/*
    Problem: Minimum number of Flips
    1) We can see that only when the sum is even then it can be changed to 0
    2) So we find out if it's even then print the result of the division else -1
    3) This is applicable for negetive values as well
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), c = 0;
            for (int i = 0; i < x; i++) c += in.nextInt();
            pw.println(Math.abs(c) % 2 == 0 ? Math.abs(c) / 2 : -1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}