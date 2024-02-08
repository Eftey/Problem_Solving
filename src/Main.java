import java.io.*;
import java.util.*;

/*
    Problem: Anton and Danik
    1) Traverse through the string and check how many A are in there
    2) Also count the number for D or Subtract size - number of A
    3) Then check which one is greater or equal
    4) Print accordingly
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String x = "leetcode", xx = "leeto ";
        pw.println(strStr(x, xx));
        pw.close();
    }

    public static int strStr(String h, String n) {
        int x = h.length(), xx = n.length();
        if (x < xx) return -1;
        else if (x == xx) return h.equals(n) ? 0 : -1;
        else {
            for (int i = 0; i <= x - xx; i++)
                if (h.substring(i, xx + i).equals(n)) return i;
        }
        return -1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}