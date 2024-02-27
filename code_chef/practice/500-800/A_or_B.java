import java.io.*;
import java.util.*;

/*
    Problem: A or B
    1) We have to reduce the points for first problem by 2 and for 2nd it's 4
    2) However, the time for 2nd should be the time for 1st + time for 2nd
    3) Another thing we have to consider is when he could score higher if he changes the order of the problem
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();

            pw.println(Math.max(((500 - (x * 2)) + (1000 - ((xx + x) * 4))), ((1000 - (xx * 4)) + (500 - ((xx + x) * 2)))));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}