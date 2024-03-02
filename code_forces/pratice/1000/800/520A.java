import java.io.*;
import java.util.*;

/*
    Problem: Pangram
    1) We use set to store only the unique elements in the string
    2) And if the size of that set is equal 26 then yes else no
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