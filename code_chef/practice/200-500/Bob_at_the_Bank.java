import java.io.*;
import java.util.*;

/*
    Problem: Bob at the Bank
    1) Current ballance + Amount he gets - his deduction * each month = His balance
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() + ((in.nextInt() - in.nextInt()) * in.nextInt()));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}