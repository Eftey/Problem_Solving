import java.io.*;
import java.util.*;

/*
    Problem: Minimum number of coins
    1) We have to consider for the higher value out of 5 and 10
    2) So if it's divisible by 10, then the result of their division is answer
    3) Else we find two things, one is the reminder and another one is the answer
    4) We add the reminder if the answer is divisible by 5 else we print -1
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x % 10 == 0) {
                pw.println(x / 10);
            } else {
                int xx = x / 10;
                int five = (x % 10);
                if (five % 5 == 0) pw.println((five / 5) + xx);
                else pw.println(-1);
            }
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}