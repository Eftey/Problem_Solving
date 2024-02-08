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
        int t = in.nextInt(), a = 0, d = 0;
        String s = in.next();
        for (char i : s.toCharArray()) {
            a += (i == 'A') ? 1 : 0;
            d += (i == 'D') ? 1 : 0;
        }
        if (a > d) pw.println("Anton");
        else if (a < d) pw.println("Danik");
        else pw.println("Friendship");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}