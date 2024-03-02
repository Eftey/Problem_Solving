import java.io.*;
import java.util.*;

/*
    Problem: Pangram
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        String s = in.next().toLowerCase();
        Set<Character> set = new HashSet<>();
        for (int tt = 0; tt < s.length(); tt++) set.add(s.charAt(tt));
        pw.println(set.size() == 26 ? "YES" : "NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}