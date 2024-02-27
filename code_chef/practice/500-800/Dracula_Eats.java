import java.io.*;
import java.util.*;

/*
    Problem: Dracula Eats
    1) We count all the Tuesdays in x
    2) And print the result
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), c = 0;
            for (int i = 2; i <= x; i += 7) c++;
            pw.println(c);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}