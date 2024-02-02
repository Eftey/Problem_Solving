import java.io.*;
import java.util.*;

/*
    Problem: Determine the Score
    1) X /10 * N
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) pw.println((in.nextInt() / 10) * in.nextInt());

        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}