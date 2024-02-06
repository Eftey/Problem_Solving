import java.io.*;
import java.util.*;


/*
    Problem: Mana Points
    1) x /  y = remaining moves
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int y = in.nextInt(), x = in.nextInt();
            pw.println(x / y);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}