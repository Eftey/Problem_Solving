import java.io.*;
import java.util.*;

/*
    Problem: Airlines
    1) If after adding both apps and still there is space then no need to delete
    2) If not then after removing each app and still there's space left for 3rd app then delete 1
    3) Else need to delete both apps
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int s = in.nextInt(), a = in.nextInt(), b = in.nextInt(), z = in.nextInt();
            pw.println((s - (a + b) >= z) ? 0 : ((s - a >= z || s - b >= z) ? 1 : 2));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}