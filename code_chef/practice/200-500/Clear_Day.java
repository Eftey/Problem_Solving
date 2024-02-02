import java.io.*;
import java.util.*;

/*
    Problem: Clear Day
    1) Rainy + Cloudy = Unclear days
    2) Week = 7 - unclear days = Clear days
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(7 - (in.nextInt() + in.nextInt()));
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}