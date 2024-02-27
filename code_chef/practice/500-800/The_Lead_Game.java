import java.io.*;
import java.util.*;

/*
    Problem: The Lead Game
    1) We cumulate the sum for each round
    2) But while doing so we also find the current max score along with who has it
    3) Then after the end of the match, we print the one with max and the max value
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), sumX = 0, sumY = 0, max = 0;
        boolean flag = false;
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            sumX += x;
            sumY += y;
            if (max < Math.abs(sumX - sumY)) {
                if (sumX > sumY) {
                    max = sumX - sumY;
                    flag = true;
                } else {
                    max = sumY - sumX;
                    flag = false;
                }
            }

        }
        pw.println(flag ? "1 " + max : "2 " + max);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}