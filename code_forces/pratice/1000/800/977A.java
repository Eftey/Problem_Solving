import java.io.*;
import java.util.*;


/*
    Problem: A Wrong Subtraction
    1) If it's divisible by 10 then it has 0 in the last digit
    2) If so then divide by 10
    3) Else subtract 1 from it
    4) And the entire time remove 1 from x until it's zero
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), x = in.nextInt(), c = 0;
        while (c != x) {
            if (n % 10 == 0) {
                n /= 10;
                c++;
            } else {
                n--;
                c++;
            }
        }
        pw.println(n);
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}