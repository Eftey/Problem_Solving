import java.io.*;
import java.util.*;

/*
    Problem: MATH1 Enrolment
    1) If there are more student than the total seat then we put 0
    2) Else just subtract the total number of seats from the students to get the remaining seats
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            if (y - x < 0) pw.println(0);
            else pw.println(y - x);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}