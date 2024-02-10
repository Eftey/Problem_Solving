import java.io.*;
import java.util.*;

/*
    Problem: Parliament
    1) Total number of people needs to be divided by 2
    2) But since a person can't be a fraction, that's why we ceil value
    3) And then if it's lower or equal than the votes then Yes else No
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            int xx = (int) Math.ceil((double) x / 2);
            pw.println(xx <= y ? "YES" : "NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}