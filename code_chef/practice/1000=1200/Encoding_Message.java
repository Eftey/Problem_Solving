import java.io.*;
import java.util.*;

/*
    Problem: Encoding Message
    1) First we swap the values putting i+1 to first then i and increase i += 2
    2) Next we change the characters a = z by using lower_bound + (upper_bound + current_character)
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            String s = in.next();
            StringBuilder sb = new StringBuilder(), xx = new StringBuilder();
            for (int i = 0; i < x - 1; i += 2) {
                sb.append(s.charAt(i + 1));
                sb.append(s.charAt(i));
            }
            if (x % 2 == 1) sb.append(s.charAt(x - 1));
            for (int i = 0; i < x; i++) xx.append((char) ('a' + ('z' - sb.charAt(i))));
            pw.println(xx);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}