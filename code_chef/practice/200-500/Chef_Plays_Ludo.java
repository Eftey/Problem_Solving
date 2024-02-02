import java.io.*;
import java.util.*;

/*
    Problem: Chef Plays Ludo
    1) If the input is 6 then Yes else No
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++)
            pw.println(in.nextInt() == 6 ? "YES" : "NO");
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}