import java.io.*;
import java.util.*;

/*
    Problem: Interior Design
    1) The minimum price is the one he ones so just add the firs 2 inputs
    2) And add the last 2 inputs and compare which one is minimum then that's the price
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.min((in.nextInt() + in.nextInt()), (in.nextInt() + in.nextInt())));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}