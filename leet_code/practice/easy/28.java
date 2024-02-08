import java.io.*;
import java.util.*;

/*
    Problem: Find the Index of the First Occurrence in a String
    1) First the size of the niddle has to be smaller or equal than haystack
    2) Then if it's euqal and it has the word in it then return 0 since it's equal in size
    2.1) So the first occurence is the first index which is 0
    3) Then if Heystack is larder in size then we have to traverse through the entire string
    4) However, we can save a little bit time if we stop the loop when the last occurence occureed.
    4.1) For incetance: in "sadbutsad" = 9 and "sad" = 3 so 9-3 = 6 Which means "sadbut" this much to be concider
    4.2) Since we hace to return the first occurence so we don't actually need the rest even if it's not "sad"
    5) So we finally check using Substring method where it takes the value from starting to end
    5.1) But since we are searching the string from current position to the last position (i in our case)
    5.2) So if we skip the length of "sad" by 3+i
    6) And if that substring then equals to the niddle then we return the idex i
    7) Else everything fails then return -1
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