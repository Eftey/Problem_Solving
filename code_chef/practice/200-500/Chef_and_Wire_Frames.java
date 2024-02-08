import java.io.*;
import java.util.*;

/*
    Problem: Chef and Wire Frames
    1) 2 * length + 2 * width = total size
    2) then multiplied by the cost = Exact price he needs
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((in.nextInt() * 2 + in.nextInt() * 2) * in.nextInt());
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}