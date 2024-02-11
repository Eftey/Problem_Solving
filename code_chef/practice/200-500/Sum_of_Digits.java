import java.io.*;
import java.util.*;

/*
    Problem: Sum of Digits
    1) We just find the reminder of a digit to get the last digit and add it to the sum
    2) Then we remove that digit by dividing the number by 10
    3) Continue to process until the number becomes less than 0
    4) And we print the sum
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            pw.println(sum);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}