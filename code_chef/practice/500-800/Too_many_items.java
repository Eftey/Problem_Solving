import java.io.*;
import java.util.*;

/*
    Problem: Too many items
    1) We take the ceiling of the values, and since 1 can have 10 so we divided the input by 10
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((int) (Math.ceil((double) in.nextInt() / 10)));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}