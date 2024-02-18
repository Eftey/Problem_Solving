import java.io.*;
import java.util.*;

/*
    Problem: Bus Seat Numbering
    1) First we check if it's an upper deck or lower deck
    2) Then check for double or single

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x >= 1 && x <= 15) pw.println(x <= 10 ? "Lower Double" : "Lower Single");
            else pw.println(x <= 25 ? "Upper Double" : "Upper Single");
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}