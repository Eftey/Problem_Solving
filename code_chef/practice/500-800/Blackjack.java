import java.io.*;
import java.util.*;

/*
    Problem: Blackjack
    1) We check for each digit from 1 tp 10 and add it to the sum to see if we could find 21
    2) If so then print that number else -1
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), i = 1;
            boolean flag = false;
            for (; i <= 10; i++) {
                if (x + y + i == 21) {
                    flag = true;
                    break;
                }
            }
            pw.println(flag ? i : -1);
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}