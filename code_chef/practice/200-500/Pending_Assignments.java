import java.io.*;
import java.util.*;

/*
    Problem: Pending Assignments
    1) Here we have to convert the minutes to days
    2) 60 minutes = 1 hour and 24 hours = 1 day so in total 24 * 60 = 1440
    3) So if we multiply all task with the given minutes and divide it by 1440 then we have the current days
    4) So we have to check if those days are lower or equal than the given days if so then Yes else no
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.ceil((double) (in.nextInt() * in.nextInt()) / 1440) <= in.nextInt() ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}