import java.io.*;
import java.util.*;

/*
    Problem: Practice makes us perfect
    1) If any of the inputs are greater or equal than 10 then we add by 1 and print the result
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a = in.nextInt(), b = in.nextInt(), cc = in.nextInt(), d = in.nextInt(), c = 0;
        if (a >= 10) c++;
        if (b >= 10) c++;
        if (cc >= 10) c++;
        if (d >= 10) c++;
        pw.println(c);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}