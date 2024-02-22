import java.io.*;
import java.util.*;

/*
    Problem: It is My Serve
    1) We can see that the turn changes back to the person after 4 serve
    2) So it's the sum of both inputs are back to person
    3) So the reminder of 4 for alice is 1 and 2
    4) While it's 3 and 4 for Bob
    5) So we add +1 to get to the original server from the first serve
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();
            pw.println((x + xx + 1) % 4 == 1 || (x + xx + 1) % 4 == 2 ? "Alice" : "Bob");
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}