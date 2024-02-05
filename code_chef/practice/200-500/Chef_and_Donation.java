import java.io.*;
import java.util.*;


/*
    Problem: Chef and Donation
    1) Chef - his wife = Charity
    2) But to avoid being negative we have to use Absolute around it
 */

public class Main {

    public static void main(String[] args) throws IOException {
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