import java.io.*;
import java.util.*;

/*
    Problem: A. Stones on the Table
    1) Check if there's a match (temp vs actual)
    2) If so then c++ else update temp
    3) Out c
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt(), c = 0;
        String s = in.next();

        char temp = 'x';
        for (char i : s.toCharArray())
            if (i == temp) c++;
            else temp = i;
        pw.println(c);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}