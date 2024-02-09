import java.io.*;
import java.util.*;

/*
    Problem: True and False Paper
    1) Since Bos has the opposite score of Alice then just subtract the number from Alice
    2) But if Alice score lower than it'll be negetive so we put Absolute to avoid that
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