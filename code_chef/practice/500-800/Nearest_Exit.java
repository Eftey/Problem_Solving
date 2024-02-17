import java.io.*;
import java.util.*;

/*
    Problem: Nearest Exit
    1) If the seat number is smaller or equal to 50 then left else right
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() <= 50 ? "LEFT" : "RIGHT");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}