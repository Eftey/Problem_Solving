import java.io.*;
import java.util.*;

/*
    Problem: How many unattempted problems
    1) X - Y
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(in.nextInt() - in.nextInt());
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}