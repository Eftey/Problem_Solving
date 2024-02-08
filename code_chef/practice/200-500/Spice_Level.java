import java.io.*;
import java.util.*;

/*
    Problem: Spice Level
    1) If it's greater than 4 then Mild else if greater than 7 then Medium else it's hot
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if(x < 4) pw.println("MILD");
            else if(x < 7) pw.println("MEDIUM");
            else pw.println("HOT");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}