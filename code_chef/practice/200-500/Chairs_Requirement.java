import java.io.*;
import java.util.*;


/*
    Problem: Chairs Requirement
    1) If the chair are greater or equal than the student then no need to buy
    2) Else he has to buy Total student - current chair count
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            pw.println(x <= y ? 0 : x - y);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}