import java.io.*;
import java.util.*;

/*
    Problem: Broken Phone
    1) If x is smaller than repair
    2) If y is smaller than new phone else any since both are equal
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            if(x < y) pw.println("REPAIR");
            else if (x > y) pw.println("NEW PHONE");
            else pw.println("ANY");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}