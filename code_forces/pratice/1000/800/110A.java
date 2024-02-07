import java.io.*;
import java.util.*;

/*
    Problem: Nearly Lucky Number
    1) Here we have to count the digits of lucky numbers in the number
    2) Then if that number is equal to the lucky digit then it's nearly lucky
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next();
        int t = 0;
        for (int i = 0; i < s.length(); i++)
            if ((s.charAt(i) == '4') || (s.charAt(i) == '7')) t++;
        pw.println(t == 7 || t == 4 ? "YES" : "NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}