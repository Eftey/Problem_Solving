import java.io.*;
import java.util.*;

/*
    Problem: Chef and Races
    1) If any of the breacket where there's no sign of his rival he wins 2
    2) If if he's in 1 game then chef wins 1 else 0
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt(), xxx = in.nextInt(), xxxx = in.nextInt();
            pw.println((x != xxx && x != xxxx) && (xx != xxx && xx != xxxx) ? 2 : (x != xxx && x != xxxx) || (xx != xxx && xx != xxxx) ? 1 : 0);

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}