import java.io.*;
import java.util.*;

/*
    Problem: Amusing Joke
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        char[] s1 = (in.next() + in.next()).toCharArray(), s2 = in.next().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        pw.println(Arrays.equals(s1, s2) ? "YES" : "NO");

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}